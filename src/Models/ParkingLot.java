package Models;

import Strategies.BillingStrategy;
import Strategies.ParkingPlaceAllotmentStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> floors ;
    private List<Gate> gates ;
    private ParkingLotStatus parkingLotStatus ;
    private ParkingPlaceAllotmentStrategy allotmentStrategy;

    private BillingStrategy billingStrategy ;

    public ParkingLot(List<ParkingFloor> floors, List<Gate> gates, ParkingLotStatus parkingLotStatus, ParkingPlaceAllotmentStrategy allotmentStrategy, BillingStrategy billingStrategy) {
        this.floors = floors;
        this.gates = gates;
        this.parkingLotStatus = parkingLotStatus;
        this.allotmentStrategy = allotmentStrategy;
        this.billingStrategy = billingStrategy;
    }

    public ParkingLot() {

    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingPlaceAllotmentStrategy getAllotmentStrategy() {
        return allotmentStrategy;
    }

    public void setAllotmentStrategy(ParkingPlaceAllotmentStrategy allotmentStrategy) {
        this.allotmentStrategy = allotmentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
