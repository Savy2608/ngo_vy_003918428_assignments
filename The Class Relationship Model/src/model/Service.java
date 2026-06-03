/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vyngo
 */

public class Service {
    private int serviceID;
    private String serviceType;
    private double cost;
    private String mechanicName;
    private int serviceDuration;

    public Service(int serviceID, String serviceType, double cost, String mechanicName, int serviceDuration) {
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.cost = cost;
        this.mechanicName = mechanicName;
        this.serviceDuration = serviceDuration;
    }

    public int getServiceID() { return serviceID; }
    public void setServiceID(int serviceID) { this.serviceID = serviceID; }

    public String getServiceType() { return serviceType; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public String getMechanicName() { return mechanicName; }
    public void setMechanicName(String mechanicName) { this.mechanicName = mechanicName; }

    public int getServiceDuration() { return serviceDuration; }
    public void setServiceDuration(int serviceDuration) { this.serviceDuration = serviceDuration; }

    @Override
    public String toString() {
        return serviceID + " - " + serviceType + " ($" + String.format("%.2f", cost) + ")";
    }
}
    
    
