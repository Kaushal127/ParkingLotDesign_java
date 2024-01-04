package Repositories;

import Exceptions.GateNotFoundException;
import Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long , Gate> gates = new HashMap<>() ;
    Map<Integer , Gate> gateMap = new HashMap<>() ;
     public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if (gates.containsKey(gateId)) {
            return gates.get(gateId) ;
        }
        throw new GateNotFoundException() ;
    }

    public void save(Gate gate) {
        gateMap.put(gate.getGateNumber() , gate);
    }

    public Gate getGateByNumber(int gateNumber) {

         return gateMap.get(gateNumber);
    }

    public Gate getGateByGateNumber(Gate gate) {
         gateMap.containsKey(gate.getGateNumber()) ;
         return gateMap.get(gate.getGateNumber()) ;
    }


}
