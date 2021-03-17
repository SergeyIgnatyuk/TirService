package TirService.service;

import TirService.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getOneEmployeeById(Long id);

    List<Employee> getAllEmployeesWhichDoNotBelongToAnyDepartment();

    void createEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    void removeEmployeeFromDepartment(Long employeeId);

    void addEmployeeToDepartment(Long employeeId, Long departmentId);

}
