package TirService.service;

import TirService.model.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    void createVehicle(Vehicle vehicle);
}
