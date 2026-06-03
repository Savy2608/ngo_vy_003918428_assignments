/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class Vehicle {
    private int vehicleID;            // primitive: int
    private String make;
    private String model;
    private int year;                 // primitive: int
    private String registrationNumber;
    private long mileage;             // primitive: long
    private boolean underWarranty;    // primitive: boolean
    private Service serviceOpted;
    private Date serviceDate;
    private Owner owner;

    public Vehicle(int vehicleID, String make, String model, int year,
                   String registrationNumber, long mileage, boolean underWarranty,
                   Service serviceOpted, Date serviceDate, Owner owner) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
        this.underWarranty = underWarranty;
        this.serviceOpted = serviceOpted;
        this.serviceDate = serviceDate;
        this.owner = owner;
    }

    public int getVehicleID() { return vehicleID; }
    public void setVehicleID(int vehicleID) { this.vehicleID = vehicleID; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public long getMileage() { return mileage; }
    public void setMileage(long mileage) { this.mileage = mileage; }

    public boolean isUnderWarranty() { return underWarranty; }
    public void setUnderWarranty(boolean underWarranty) { this.underWarranty = underWarranty; }

    public Service getServiceOpted() { return serviceOpted; }
    public void setServiceOpted(Service serviceOpted) { this.serviceOpted = serviceOpted; }

    public Date getServiceDate() { return serviceDate; }
    public void setServiceDate(Date serviceDate) { this.serviceDate = serviceDate; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }

    @Override
    public String toString() {
        return vehicleID + " - " + year + " " + make + " " + model + " [" + registrationNumber + "]";
    }
}