package TirService.service;

import TirService.model.Employee;
import TirService.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .sorted(((o1, o2) -> (int) (o1.getId() - o2.getId())))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployeesWhichDoNotBelongToAnyDepartment() {
        return employeeRepository.getEmployeesByDepartmentIdIsNull()
                .stream()
                .sorted(((o1, o2) -> (int) (o1.getId() - o2.getId())))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Employee getOneEmployeeById(Long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    @Transactional
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void removeEmployeeFromDepartment(Long employeeId) {
        employeeRepository.removeEmployeeFromDepartment(employeeId);
    }

    @Override
    @Transactional
    public void addEmployeeToDepartment(Long employeeId, Long departmentId) {
        employeeRepository.addEmployeeToDepartment(employeeId, departmentId);
    }
}
