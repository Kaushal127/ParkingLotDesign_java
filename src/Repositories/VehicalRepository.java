package Repositories;

import Dtos.IssueTicketRequest;
import Models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicalRepository {
    Map<String , Vehicle> vehicleMap = new HashMap<>() ;
    Long prevoiusId = 0l ;
    public Vehicle getVehicleForNumber(String vehicleNumber) {
        if (vehicleMap.containsKey(vehicleNumber)) {
            return vehicleMap.get(vehicleNumber) ;
        }
        return null ;
    }
}
