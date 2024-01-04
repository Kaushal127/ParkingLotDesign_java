package Controllers;

import Models.ParkingFloor;
import Models.ParkingStatus;
import Models.VechicleType;
import Services.ParkingSlotService;

public class ParkingSlotController {
    private ParkingSlotService parkingSlotService ;

    public ParkingSlotController(ParkingSlotService parkingSlotService) {
        this.parkingSlotService = parkingSlotService ;
    }

    public void createParkingSlot(int slotNumber , VechicleType vechicleType , ParkingStatus parkingStatus , ParkingFloor parkingFloor){
        parkingSlotService.createParkingSlot(slotNumber,vechicleType,parkingStatus,parkingFloor) ;
        System.out.println("Parking slot created sucessfully : "+slotNumber);
    }
}
