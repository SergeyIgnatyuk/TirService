package TirService.repository;

import TirService.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> getEmployeesByDepartmentIdIsNull();

    @Modifying
    @Query("UPDATE Employee e SET e.departmentId = null WHERE e.id = :employeeId")
    void removeEmployeeFromDepartment(@Param("employeeId") Long employeeId);

    @Modifying
    @Query("UPDATE Employee e SET e.departmentId = :departmentId WHERE e.id = :employeeId")
    void addEmployeeToDepartment(@Param("employeeId") Long employeeId, @Param("departmentId") Long departmentId);
}
