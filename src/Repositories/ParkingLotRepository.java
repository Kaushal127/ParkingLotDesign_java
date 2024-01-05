package Repositories;

import Exceptions.ParkingLotNotFoundException;
import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long , ParkingLot> parkingLotMap = new HashMap<>() ;
    Long prevoiusId = 0l ;
    public ParkingLot getParkingLotById(Long parkingLotId) throws ParkingLotNotFoundException {
        if (parkingLotMap.containsKey(parkingLotId)) {
            parkingLotMap.get(parkingLotId) ;
        }

        throw new ParkingLotNotFoundException() ;
    }

    public void saveParkingLot(ParkingLot parkingLot) {
        prevoiusId++ ;
        parkingLot.setId(prevoiusId);
        parkingLotMap.put(prevoiusId , parkingLot) ;
    }
}
