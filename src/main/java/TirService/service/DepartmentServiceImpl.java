package TirService.service;

import TirService.model.Department;
import TirService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    @Transactional
    public Department getDepartmentById(Long id) {
        return departmentRepository.getOne(id);
    }
}
