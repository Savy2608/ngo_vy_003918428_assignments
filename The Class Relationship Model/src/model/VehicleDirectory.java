package model;

import java.util.ArrayList;

public class VehicleDirectory {
    private ArrayList<Vehicle> vehicles;
    private int nextID;

    public VehicleDirectory() {
        vehicles = new ArrayList<>();
        nextID = 1;
    }

    public Vehicle addVehicle(String make, String model, int year, String regNum,
                               long mileage, boolean underWarranty,
                               Service service, java.util.Date serviceDate, Owner owner) {
        Vehicle v = new Vehicle(nextID++, make, model, year, regNum,
                                mileage, underWarranty, service, serviceDate, owner);
        vehicles.add(v);
        return v;
    }

    public boolean removeVehicle(int vehicleID) {
        return vehicles.removeIf(v -> v.getVehicleID() == vehicleID);
    }

    public Vehicle findByID(int vehicleID) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleID() == vehicleID) return v;
        }
        return null;
    }

    public ArrayList<Vehicle> searchByMake(String make) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getMake().equalsIgnoreCase(make)) result.add(v);
        }
        return result;
    }

    public ArrayList<Vehicle> searchByOwnerName(String name) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            String fullName = v.getOwner().getFullName().toLowerCase();
            if (fullName.contains(name.toLowerCase())) result.add(v);
        }
        return result;
    }

    public ArrayList<Vehicle> searchByRegistration(String regNum) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getRegistrationNumber().equalsIgnoreCase(regNum)) result.add(v);
        }
        return result;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public int peekNextID() {
        return nextID;
    }

    public int size() {
        return vehicles.size();
    }
}