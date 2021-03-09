package TirService.service;

import TirService.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void createEmployee(Employee employee);
}
