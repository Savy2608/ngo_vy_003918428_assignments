/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class ServiceCatalog {
    private ArrayList<Service> services;
    private int nextID;

    public ServiceCatalog() {
        services = new ArrayList<>();
        nextID = 1;
        addService("Oil Change", 49.99, "Mike Johnson", 30);
        addService("Car Wash", 19.99, "Sara Lee", 20);
        addService("Tire Rotation", 29.99, "Tom Brown", 45);
        addService("Brake Inspection", 59.99, "Mike Johnson", 60);
        addService("AC Service", 89.99, "Carlos Rivera", 90);
    }

    public int peekNextID() { return nextID; }

    public Service addService(String serviceType, double cost, String mechanicName, int duration) {
        Service s = new Service(nextID++, serviceType, cost, mechanicName, duration);
        services.add(s);
        return s;
    }

    public boolean removeService(int serviceID) {
        return services.removeIf(s -> s.getServiceID() == serviceID);
    }

    public Service findByID(int serviceID) {
        for (Service s : services) {
            if (s.getServiceID() == serviceID) return s;
        }
        return null;
    }

    public ArrayList<Service> getAllServices() {
        return new ArrayList<>(services);
    }
}