import Controllers.*;
import Dtos.IssueTicketRequest;
import Dtos.IssueTicketResponse;
import Models.*;
import Repositories.*;
import Services.*;
import Strategies.ParkingPlaceAllotmentStrategy;
import Strategies.SimpleParkingSlotAllotStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Repositories
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicalRepository vehicalRepository = new VehicalRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();

        // Services
        GateService gateService = new GateService(gateRepository);
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingFloorService parkingFloorService = new ParkingFloorService(parkingFloorRepository);
        ParkingSlotService parkingSlotService = new ParkingSlotService(parkingSlotRepository);
        TicketService ticketService = new TicketService(gateRepository, parkingLotRepository, ticketRepository, vehicalRepository);

        // Controllers
        GateController gateController = new GateController(gateService);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        ParkingFloorController parkingFloorController = new ParkingFloorController(parkingFloorService);
        ParkingSlotController parkingSlotController = new ParkingSlotController(parkingSlotService);
        TicketController ticketController = new TicketController(ticketService);

        // 1. Create gates
        List<Gate> gates = new ArrayList<>() ;
        Gate entryGate = gateController.createGate(1, GateType.ENTRY, new Operator(1, "John"), GateStatus.ACTIVE);
        gateController.updateGateStatus(entryGate , GateStatus.ACTIVE);
        gates.add(entryGate);
        // 2. Create Parking Floors

        parkingFloorController.createParkingFloor(1);
        parkingFloorController.createParkingFloor(2);

        // 3. Create Parking slot
        List<ParkingFloor> floors = new ArrayList<>() ;
        ParkingFloor floor1 = new ParkingFloor();
        floor1.setFloorNumber(1);
        parkingSlotController.createParkingSlot(1,VechicleType.FOUR_WHEELER,ParkingStatus.EMPTY,floor1);
        parkingSlotController.createParkingSlot(2,VechicleType.FOUR_WHEELER,ParkingStatus.EMPTY,floor1);
        ParkingFloor floor2 = new ParkingFloor() ;
        floor2.setFloorNumber(2) ;
        parkingSlotController.createParkingSlot(3,VechicleType.FOUR_WHEELER ,ParkingStatus.EMPTY ,floor2);
        parkingSlotController.createParkingSlot(4,VechicleType.FOUR_WHEELER, ParkingStatus.EMPTY ,floor2);
        floors.add(floor1);
        floors.add(floor2);
        // 4. Create a parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLotController.createParkingLot(parkingLot);
        parkingLot.setFloors(floors);
        parkingLot.setGates(gates);

        parkingLot.setParkingLotStatus(ParkingLotStatus.ACTIVE);

        //  5. Issue Ticket
          // Succesful ticket issued
         IssueTicketRequest validRequest = new IssueTicketRequest(
                 VechicleType.FOUR_WHEELER , "MH12TY9802","Kaushal", 1l ,1l ) ;
        IssueTicketResponse validTicketResponse = ticketController.issueTicket(validRequest);
        System.out.println("Scenario 1: " + validTicketResponse.getMessage());
        System.out.println("Ticket issued for :" + validRequest.getVechicleType() + " " + validRequest.getVehicleNumber() +" " +validRequest.getOwnerName());

          // Gate Not Found
        IssueTicketRequest invalidGateRequest = new IssueTicketRequest(
                VechicleType.FOUR_WHEELER, "MH12TY9802", "Kaushal", 999l, 1l);
        IssueTicketResponse invalidGateResponse = ticketController.issueTicket(invalidGateRequest);
        System.out.println("Scenario 2: " + invalidGateResponse.getMessage());

         // Parking lot not found
        IssueTicketRequest invalidParkingLotRequest = new IssueTicketRequest(
                VechicleType.FOUR_WHEELER, "MH12HK9176", "Kaushal", 1l, 999l);
        IssueTicketResponse invalidParkingLotResponse = ticketController.issueTicket(invalidParkingLotRequest);
        System.out.println("Scenario 3: " + invalidParkingLotResponse.getMessage());
    }
}
