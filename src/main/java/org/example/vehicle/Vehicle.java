package org.example.vehicle;


public class Vehicle {

    String vehicleType ;
    String vehicleId ;
    Ticket ticket;

    public Vehicle(String vehicleType , String vehicleId){
        this.vehicleId=vehicleId;
        this.vehicleType=vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

}

//    i would be needing a vehicle class which will have parameters like vehicle type , vehicleId and the parkingLevel where it will be parked.
//        another class will be parkingslot class which will contain the parameters like motorcycleParking , carParking , busParking and will have methods to retrieve the current status of the available parkings in respective sections and another method to handle vehicle entry and exit . third class we can create is of Parkinglevles which will contains List of object of class parkingslot and a method to check which level can be used for parking