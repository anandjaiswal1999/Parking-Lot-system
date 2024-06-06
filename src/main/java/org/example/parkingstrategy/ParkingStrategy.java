package org.example.parkingstrategy;

import org.example.parkingslot.ParkingSlot;

import java.util.List;

public abstract class ParkingStrategy {
    public ParkingSlot strategy(List<ParkingSlot> parkingSlots, String vehicleType) {
        return parkingSlots.get(0);
    }
}
