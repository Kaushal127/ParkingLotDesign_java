package Dtos;

import Models.VechicleType;

public class IssueTicketRequest {
    private VechicleType vechicleType ;
    private String vehicleNumber ;
    private String ownerName ;
    private Long gateId ;
    private Long parkingLotId ;

    public IssueTicketRequest(VechicleType vechicleType, String vehicleNumber, String ownerName, Long gateId, Long parkingLotId) {
        this.vechicleType = vechicleType;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.gateId = gateId;
        this.parkingLotId = parkingLotId;
    }

    public VechicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
