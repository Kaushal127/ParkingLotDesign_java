package Controllers;

import Dtos.IssueTicketRequest;
import Dtos.IssueTicketResponse;
import Dtos.ResponseStatus;
import Exceptions.GateNotFoundException;
import Exceptions.ParkingLotFullException;
import Exceptions.ParkingLotNotFoundException;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private static final String INVALID_GATE = "Gate is not valid";
    private static final String INVALID_PARKING_LOT = "Parking lot is not valid";
    private static final String PARKING_LOT_FULL = "Parking lot is full find some place on road...!!";
    private TicketService ticketService ;
    private static String TICKET_ISSUED_MESSAGE = "Ticket issued";

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService ;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest){
        Ticket ticket = null ;
        try {
            ticketService.issueTicket(ticketRequest) ;
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null , ResponseStatus.FAILURE , INVALID_GATE) ;
        } catch (ParkingLotNotFoundException e) {
            return new IssueTicketResponse(null , ResponseStatus.FAILURE , INVALID_PARKING_LOT );
        } catch (ParkingLotFullException e) {
            return new IssueTicketResponse(null , ResponseStatus.FAILURE , PARKING_LOT_FULL) ;
        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCESS,TICKET_ISSUED_MESSAGE) ;
    }
}
