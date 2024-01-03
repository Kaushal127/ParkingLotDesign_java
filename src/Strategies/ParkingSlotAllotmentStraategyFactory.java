package Strategies;

public class ParkingSlotAllotmentStraategyFactory {
    public static ParkingPlaceAllotmentStrategy getParkingAllotmentStrategyForType(
            ParkingPlaceAllotmentStrategy allotmentStrategy) {
        return new SimpleParkingSlotAllotStrategy();
    }
}
