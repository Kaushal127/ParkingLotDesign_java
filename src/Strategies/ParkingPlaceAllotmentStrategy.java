package Strategies;

import Exceptions.ParkingLotFullException;
import Models.ParkingSlot;
import Models.VechicleType;

public interface ParkingPlaceAllotmentStrategy {
    ParkingSlot getParkingSlot(VechicleType vechicleType , Long parkingLotId) throws ParkingLotFullException;
}
