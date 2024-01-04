package Repositories;

import Models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer , ParkingFloor> parkingFloorMap = new HashMap<>() ;
    public void saveParkingFloor(ParkingFloor parkingFloor) {
        parkingFloorMap.put(parkingFloor.getFloorNumber() , parkingFloor ) ;
    }
}
