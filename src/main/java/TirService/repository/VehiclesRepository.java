package TirService.repository;

import TirService.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicle, Long> {
}
