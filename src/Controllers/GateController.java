package Controllers;

import Models.Gate;
import Models.GateStatus;
import Models.GateType;
import Models.Operator;
import Services.GateService;

public class GateController {
  private GateService gateService ;

    public GateController(GateService gateService) {
        this.gateService = gateService ;
    }

    public void createGate(int gateNumber , GateType gateType , Operator operator , GateStatus gateStatus){
     gateService.createGate(gateNumber,gateType,operator,gateStatus) ;
     System.out.println("Gate created Suceesfully : "+gateNumber);
  }

    public void updateGateStatus(int gateNumber, GateStatus newStatus) {
        gateService.updateGateStatus(gateNumber, newStatus);
        System.out.println("Gate status updated successfully: " + gateNumber);
    }

    public Gate gateGateById(Gate gate){
        gate = gateService.getGateByGateNumber(gate) ;
        return gate ;
    }
}
