package Repositories;

import Exceptions.GateNotFoundException;
import Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long , Gate> gates = new HashMap<>() ;
    Long previoudId = 0l ;
    // Map<Integer , Gate> gateMap = new HashMap<>() ;
     public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if (gates.containsKey(gateId)) {
            return gates.get(gateId) ;
        }
        throw new GateNotFoundException() ;
    }

    public void save(Gate gate) {
         previoudId++;
         gate.setId(previoudId);
         gates.putIfAbsent(previoudId,gate) ;
    }

}
