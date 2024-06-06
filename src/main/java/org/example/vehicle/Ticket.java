package org.example.vehicle;

import org.example.parkingslot.ParkingSlot;

import java.util.Date;

public class Ticket {
    java.util.Date entryTime ;
    Integer entryGate ;

    ParkingSlot slot ;

    public java.util.Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Integer entryGate) {
        this.entryGate = entryGate;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }
}
