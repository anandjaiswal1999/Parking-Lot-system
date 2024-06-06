package org.example.vehicle;

import org.example.Enums.VehicleType;
import org.example.Factory.FactoryParkingManager;
import org.example.Factory.FactoryVehicle;
import org.example.parkingmanager.ParkingSlotManager;
import org.example.parkingslot.ParkingSlot;

import java.sql.Timestamp;
import java.util.Date;

public class EntranceGate {
    FactoryParkingManager factoryParkingManager = new FactoryParkingManager();
    Ticket ticket= new Ticket();

    public Ticket getTicket (String vehicleType , int entranceGate){
        ParkingSlotManager parkingSlotManager = factoryParkingManager.getVehicleSpot(vehicleType);
        ParkingSlot parkingSlot = parkingSlotManager.findParKingSlot(vehicleType);
        ticket.setEntryGate(entranceGate);
        ticket.setSlot(parkingSlot);
        ticket.setEntryTime(new Date());
        return ticket;
    }

}
