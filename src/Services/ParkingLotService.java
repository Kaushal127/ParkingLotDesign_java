package Services;

import Models.ParkingLot;
import Repositories.ParkingLotRepository;

public class  ParkingLotService {
    private ParkingLotRepository parkingLotRepository ;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository ;
    }

    public void createParkingLot(ParkingLot parkingLot) {

        parkingLotRepository.saveParkingLot(parkingLot) ;
    }
}
