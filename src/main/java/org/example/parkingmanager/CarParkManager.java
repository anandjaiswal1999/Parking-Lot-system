package org.example.parkingmanager;

import org.example.parkingslot.ParkingSlot;
import org.example.parkingstrategy.CarParkingStrategy;

import java.util.List;

public class CarParkManager extends ParkingSlotManager {

    public CarParkManager(List<ParkingSlot> parkingSlotList , CarParkingStrategy carParkingStrategy) {
        super(parkingSlotList , carParkingStrategy);
    }

}
