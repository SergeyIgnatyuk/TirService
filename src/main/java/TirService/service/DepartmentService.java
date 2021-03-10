package TirService.service;

import TirService.model.Department;
import TirService.model.Employee;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    void createDepartment(Department department);
    Department getDepartmentById(Long id);
}
