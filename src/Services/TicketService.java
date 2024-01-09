package Services;

import Dtos.IssueTicketRequest;
import Exceptions.GateNotFoundException;
import Exceptions.ParkingLotFullException;
import Exceptions.ParkingLotNotFoundException;
import Models.*;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicalRepository;
import Strategies.ParkingPlaceAllotmentStrategy;
import Strategies.ParkingSlotAllotmentStraategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private GateRepository gateRepository ;
    private VehicalRepository vehicalRepository ;
    private ParkingLotRepository parkingLotRepository ;
    private TicketRepository ticketRepository ;

    public TicketService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, VehicalRepository vehicalRepository) {
        this.gateRepository = gateRepository ;
        this.parkingLotRepository = parkingLotRepository ;
        this.ticketRepository = ticketRepository ;
        this.vehicalRepository = vehicalRepository ;
    }

    public Ticket  issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {
        Ticket ticket = new Ticket() ;
        // 1.set the time
        ticket.setEntryTime(new Date());

        // 2.get the gate and vehicle details
        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId()) ;
        ticket.setGate(gate);

        Vehicle vehicle = vehicalRepository.getVehicleForNumber(ticketRequest.getVehicleNumber()) ;
        ticket.setVehicle(vehicle);

        // 3.get parking slot
        ticket.setParkingSlot(getParkingSlot(ticketRequest)) ;
        // 4.get parking lot
//        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(ticketRequest.getParkingLotId()) ;
//        ticket.setParkingLot(parkingLot);

        // 5. ticket number unique
        ticket.setNumber(ticketRequest.getOwnerName()+ UUID.randomUUID());

        // 6.Save the ticket and return


        return ticketRepository.save(ticket) ;

    }

    private ParkingSlot getParkingSlot(IssueTicketRequest ticketRequest) throws ParkingLotNotFoundException, ParkingLotFullException {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(ticketRequest.getParkingLotId()) ;
        ParkingPlaceAllotmentStrategy allotmentStrategy = parkingLot.getAllotmentStrategy() ;

        ParkingPlaceAllotmentStrategy placeAllotmentRule =
                ParkingSlotAllotmentStraategyFactory.getParkingAllotmentStrategyForType(allotmentStrategy) ;

        ParkingSlot parkingSlot = placeAllotmentRule.getParkingSlot(ticketRequest.getVechicleType() , ticketRequest.getParkingLotId()) ;
        return parkingSlot ;
    }
}
