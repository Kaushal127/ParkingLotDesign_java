package Services;

import Models.ParkingFloor;
import Models.ParkingSlot;
import Models.ParkingStatus;
import Models.VechicleType;
import Repositories.ParkingSlotRepository;

public class ParkingSlotService {
    private ParkingSlotRepository parkingSlotRepository ;

    public ParkingSlotService(ParkingSlotRepository parkingSlotRepository) {
        this.parkingSlotRepository = parkingSlotRepository ;
    }

    public void createParkingSlot(int slotNumber, VechicleType vechicleType, ParkingStatus parkingStatus, ParkingFloor parkingFloor) {
        ParkingSlot parkingSlot = new ParkingSlot() ;
        parkingSlot.setNumber(slotNumber);
        parkingSlot.setVechicleType(vechicleType);
        parkingSlot.setParkingStatus(parkingStatus);
        parkingSlot.setFloor(parkingFloor);
        parkingSlotRepository.saveParkingSlot(parkingSlot) ;
    }
}
