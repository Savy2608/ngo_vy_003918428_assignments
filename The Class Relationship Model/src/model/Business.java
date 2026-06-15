/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vyngo
 */
public class Business {
    private VehicleDirectory vehicleDirectory;
    private ServiceCatalog serviceCatalog;
    private ArrayList<Owner> owners;
    private int nextOwnerID;

    private static Business instance;

    private Business() {
        vehicleDirectory = new VehicleDirectory();
        serviceCatalog = new ServiceCatalog();
        owners = new ArrayList<>();
        nextOwnerID = 1;
    }

    public static Business getInstance() {
        if (instance == null) instance = new Business();
        return instance;
    }

    public Owner addOwner(String firstName, String lastName) {
        Owner o = new Owner(nextOwnerID++, firstName, lastName);
        owners.add(o);
        return o;
    }

    public ArrayList<Owner> getAllOwners() {
        return new ArrayList<>(owners);
    }

    public int peekNextOwnerID() { return nextOwnerID; }
    public int peekNextVehicleID() { return vehicleDirectory.peekNextID(); }
    public int peekNextServiceID() { return serviceCatalog.peekNextID(); }

    public Owner findOwnerByID(int id) {
        for (Owner o : owners) {
            if (o.getOwnerID() == id) return o;
        }
        return null;
    }

    public Vehicle addVehicle(String make, String model, int year, String regNum,
                               long mileage, boolean underWarranty,
                               Service service, Date serviceDate, Owner owner) {
        return vehicleDirectory.addVehicle(make, model, year, regNum,
                                           mileage, underWarranty, service, serviceDate, owner);
    }

    public boolean deleteVehicle(int vehicleID) {
        return vehicleDirectory.removeVehicle(vehicleID);
    }

    public Vehicle findVehicleByID(int vehicleID) {
        return vehicleDirectory.findByID(vehicleID);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return vehicleDirectory.getAllVehicles();
    }

    public ArrayList<Vehicle> searchVehiclesByMake(String make) {
        return vehicleDirectory.searchByMake(make);
    }

    public ArrayList<Vehicle> searchVehiclesByOwnerName(String name) {
        return vehicleDirectory.searchByOwnerName(name);
    }

    public ArrayList<Vehicle> searchVehiclesByRegistration(String regNum) {
        return vehicleDirectory.searchByRegistration(regNum);
    }

    public Service addService(String type, double cost, String mechanic, int duration) {
        return serviceCatalog.addService(type, cost, mechanic, duration);
    }

    public ArrayList<Service> getAllServices() {
        return serviceCatalog.getAllServices();
    }

    public Service findServiceByID(int id) {
        return serviceCatalog.findByID(id);
    }

    public boolean deleteService(int serviceID) {
        return serviceCatalog.removeService(serviceID);
    }

    public void seedData() {
        ArrayList<Service> services = serviceCatalog.getAllServices();
        Owner o1 = addOwner("Alice", "Smith");
        Owner o2 = addOwner("Bob", "Johnson");
        Owner o3 = addOwner("Carol", "Williams");
        Owner o4 = addOwner("David", "Brown");
        Owner o5 = addOwner("Eva", "Davis");
        Owner o6 = addOwner("Frank", "Miller");
        Date today = new Date();
        //                make      model      year  reg          mileage  warranty service          date   owner
        addVehicle("Toyota", "Camry",   2020, "ABC-1001", 45000L,  true,  services.get(0), today, o1);
        addVehicle("Honda",  "Civic",   2019, "ABC-1002", 62000L,  false, services.get(1), today, o2);
        addVehicle("Toyota", "Corolla", 2021, "ABC-1003", 28000L,  true,  services.get(2), today, o3);
        addVehicle("Ford",   "Mustang", 2022, "ABC-1004", 15000L,  true,  services.get(3), today, o4);
        addVehicle("BMW",    "X5",      2023, "ABC-1005",  8000L,  true,  services.get(4), today, o5);
        addVehicle("Honda",  "Accord",  2018, "ABC-1006", 91000L,  false, services.get(1), today, o6);
    }
}

    