package TirService.service;

import TirService.model.Department;
import TirService.model.Employee;
import TirService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    @Transactional
    public Department getDepartmentById(Long id) {
        Department department = departmentRepository.getOne(id);
        Set<Employee> employees = department.getEmployees();
        department.setEmployees(employees.stream().sorted(((o1, o2) -> (int) (o1.getId() - o2.getId()))).collect(Collectors.toCollection(LinkedHashSet::new)));
        return departmentRepository.getOne(id);
    }

    @Override
    @Transactional
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    @Transactional
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }
}
