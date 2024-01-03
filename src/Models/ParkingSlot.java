package Models;

public class ParkingSlot extends BaseModel {
    private VechicleType vechicleType ;
    private ParkingStatus parkingStatus ;

    private  int number ;
    private  ParkingFloor floor ;

    public ParkingSlot(VechicleType vechicleType, ParkingStatus parkingStatus, int number, ParkingFloor floor) {
        this.vechicleType = vechicleType;
        this.parkingStatus = parkingStatus;
        this.number = number;
        this.floor = floor;
    }

    public VechicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
}
