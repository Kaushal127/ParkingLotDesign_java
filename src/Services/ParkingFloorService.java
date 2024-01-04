package Services;

import Models.ParkingFloor;
import Repositories.ParkingFloorRepository;

public class ParkingFloorService {
    private ParkingFloorRepository parkingFloorRepository ;

    public ParkingFloorService(ParkingFloorRepository parkingFloorRepository) {
        this.parkingFloorRepository = parkingFloorRepository ;
    }

    public void createParkingFloor(int floorNumber) {
        ParkingFloor parkingFloor = new ParkingFloor() ;
        parkingFloor.setFloorNumber(floorNumber);
        parkingFloorRepository.saveParkingFloor(parkingFloor ) ;
    }
}
