package Repositories;

import Models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {
    Map<Integer , ParkingSlot> parkingSlotMap = new HashMap<>() ;
    public void saveParkingSlot(ParkingSlot parkingSlot) {
        parkingSlotMap.put(parkingSlot.getNumber() , parkingSlot) ;
    }
}
