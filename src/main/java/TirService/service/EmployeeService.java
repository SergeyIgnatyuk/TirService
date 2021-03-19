package TirService.service;

import TirService.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    List<Employee> getAllEmployeesWhichDoNotBelongToAnyDepartment();

    Employee getOneEmployeeById(Long id);

    void createEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    void removeEmployeeFromDepartment(Long employeeId);

    void addEmployeeToDepartment(Long employeeId, Long departmentId);

}
