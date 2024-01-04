package Services;

import Models.Gate;
import Models.GateStatus;
import Models.GateType;
import Models.Operator;
import Repositories.GateRepository;

public class GateService {
    private GateRepository gateRepository ;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository ;
    }

    public void createGate(int gateNumber, GateType gateType, Operator operator, GateStatus gateStatus) {
        Gate gate = new Gate(gateNumber,gateType,operator,gateStatus) ;
        gateRepository.save(gate) ;
    }

    public void updateGateStatus(int gateNumber, GateStatus newStatus) {
        Gate gate = gateRepository.getGateByNumber(gateNumber);

        if (gate != null) {
            gate.setGateStatus(newStatus);
            gateRepository.save(gate);
        }
    }

    public Gate getGateByGateNumber(Gate gate) {
        gate = gateRepository.getGateByGateNumber(gate) ;
        return gate;
    }
}
