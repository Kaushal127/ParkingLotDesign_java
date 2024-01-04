package Controllers;

import Models.ParkingLot;
import Services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService ;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService ;
    }

    public void createParkingLot(ParkingLot parkingLot){
        parkingLotService.createParkingLot(parkingLot) ;
        System.out.println("Parking lot created Sucessfully : " + parkingLot.getId() );
    }
}
