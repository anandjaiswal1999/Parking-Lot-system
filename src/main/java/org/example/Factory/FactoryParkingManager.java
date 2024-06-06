package org.example.Factory;

import org.example.Enums.VehicleType;
import org.example.parkingmanager.CarParkManager;
import org.example.parkingmanager.MotorCycleParkManager;
import org.example.parkingmanager.ParkingSlotManager;
import org.example.parkingslot.CarParkingSlot;
import org.example.parkingslot.MotorCycleParkingSlot;
import org.example.parkingslot.ParkingSlot;
import org.example.parkingstrategy.CarParkingStrategy;

import java.util.ArrayList;

public class FactoryParkingManager {

    public ParkingSlotManager getVehicleSpot (String vehicleType){
        if(vehicleType.equals(VehicleType.MOTORCYCLE.name())){
            return new MotorCycleParkManager(new ArrayList<>(100));
        }else if (vehicleType.equals(VehicleType.CAR.name())){
            return new CarParkManager(new ArrayList<>(50) , new CarParkingStrategy());
        }
        return new ParkingSlotManager(new ArrayList<>(20),new CarParkingStrategy());
    }
}
