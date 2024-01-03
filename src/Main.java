import Controllers.TicketController;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicalRepository;
import Services.TicketService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
           1. Create gates , floors , parking slots , parking lot
               option 1 : create controller for all the above
               option 2 : you can directly call repositories and create them
           2. just 2 floors , each floor will have only 2 spots . Make it full
           3. Is issueTicket working fine (it should throw an error )
           4. Test all the exceptions
           5. Try to implement few other features along with issue ticket .
         */
        GateRepository gateRepository = new GateRepository() ;
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository() ;
        TicketRepository ticketRepository = new TicketRepository() ;
        VehicalRepository vehicalRepository = new VehicalRepository();

        TicketService ticketService = new TicketService(gateRepository,parkingLotRepository,ticketRepository,vehicalRepository) ;

        TicketController ticketController = new TicketController(ticketService) ;


     }
}