package Strategies;

import Models.ParkingSlot;
import Models.VechicleType;

public class SimpleParkingSlotAllotStrategy implements ParkingPlaceAllotmentStrategy {

    @Override
    public ParkingSlot getParkingSlot(VechicleType vechicleType, Long parkingLotId) {
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setVechicleType(vechicleType);

        return parkingSlot;
    }
}
