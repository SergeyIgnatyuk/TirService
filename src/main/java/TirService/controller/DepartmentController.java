package TirService.controller;

import TirService.model.Department;
import TirService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public String getAllDepartments(ModelMap modelMap) {
        modelMap.addAttribute("departments", departmentService.getAllDepartments());
        return "/departments";
    }

    @GetMapping("/new")
    public  String getNewDepartmentForm(ModelMap modelMap) {
        modelMap.addAttribute("department", Department.builder().build());
        return "/newDepartment";
    }
}
