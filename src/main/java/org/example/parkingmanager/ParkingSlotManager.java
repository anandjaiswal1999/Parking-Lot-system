package org.example.parkingmanager;

import org.example.Factory.FactoryVehicle;
import org.example.parkingslot.ParkingSlot;
import org.example.parkingstrategy.ParkingStrategy;

import java.util.List;

public class ParkingSlotManager {

    List<ParkingSlot> parkingSlots ;

    ParkingStrategy parkingStrategy;
    public ParkingSlotManager (List<ParkingSlot> parkingSlotList ,ParkingStrategy parkingStrategy){
        this.parkingSlots=parkingSlotList;
        this.parkingStrategy=parkingStrategy;
    }


     public ParkingSlot findParKingSlot (String vehicleType){
        return parkingStrategy.strategy(parkingSlots,vehicleType);
    }
    public void addVehicle (){};
    public void removeVehicle(){};

}
