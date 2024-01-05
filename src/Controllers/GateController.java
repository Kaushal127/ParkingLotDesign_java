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

    public Gate createGate(int gateNumber , GateType gateType , Operator operator , GateStatus gateStatus){
     Gate gate = gateService.createGate(gateNumber,gateType,operator,gateStatus) ;
     System.out.println("Gate created Suceesfully : "+gateNumber);
     return gate ;
  }

    public void updateGateStatus(Gate gate, GateStatus newStatus) {
        gateService.updateGateStatus(gate , newStatus);
        System.out.println(gate.getGateNumber() + " Gate status updated successfully to "+ newStatus );
    }

}
