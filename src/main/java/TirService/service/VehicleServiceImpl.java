package TirService.service;

import TirService.model.Vehicle;
import TirService.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehiclesRepository vehiclesRepository;

    @Autowired
    public VehicleServiceImpl(VehiclesRepository vehiclesRepository) {
        this.vehiclesRepository = vehiclesRepository;
    }

    @Override
    @Transactional
    public List<Vehicle> getAllVehicles() {
        return vehiclesRepository.findAll();
    }
}
