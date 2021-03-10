package TirService.service;

import TirService.model.Department;
import TirService.model.Employee;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    void createDepartment(Department department);
    void deleteDepartmentById(Long id);
}
