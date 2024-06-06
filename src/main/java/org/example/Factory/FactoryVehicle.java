package org.example.Factory;

import org.example.Enums.VehicleType;
import org.example.parkingmanager.CarParkManager;
import org.example.parkingmanager.MotorCycleParkManager;
import org.example.parkingslot.CarParkingSlot;
import org.example.parkingslot.MotorCycleParkingSlot;
import org.example.parkingslot.ParkingSlot;
import org.example.parkingstrategy.CarParkingStrategy;

import java.util.ArrayList;

public class FactoryVehicle {

    public ParkingSlot getVehicleSpot (String vehicleType){
        if(vehicleType.equals(VehicleType.MOTORCYCLE.name())){
            return new MotorCycleParkingSlot();
        }else if (vehicleType.equals(VehicleType.CAR.name())){
            return new CarParkingSlot();
        }
        return new ParkingSlot();
    }
}
