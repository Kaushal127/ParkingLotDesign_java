package Models;

public class Vehicle extends BaseModel {
    private String vehicleNumber ;
    private VechicleType vechicleType ;
    private String ownerName ;

    public Vehicle(String vehicleNumber, VechicleType vechicleType, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.vechicleType = vechicleType;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VechicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
