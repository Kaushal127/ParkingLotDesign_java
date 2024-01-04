package Controllers;

import Services.ParkingFloorService;

public class ParkingFloorController {
    private ParkingFloorService parkingFloorService ;

    public ParkingFloorController(ParkingFloorService parkingFloorService) {
            this.parkingFloorService = parkingFloorService ;
    }

    public void createParkingFloor(int floorNumber){
        parkingFloorService.createParkingFloor(floorNumber) ;
        System.out.println("Parking Floor created sucessfully : "+floorNumber);
    }
}
