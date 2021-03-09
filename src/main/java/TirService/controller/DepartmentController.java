package TirService.controller;

import TirService.model.Department;
import TirService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;
    private final Validator validator;

    @Autowired
    public DepartmentController(DepartmentService departmentService, @Qualifier("departmentValidator") Validator validator) {
        this.departmentService = departmentService;
        this.validator = validator;
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

    @PostMapping("/new")
    public String createDepartment(@ModelAttribute("department") Department department, BindingResult result) {
        validator.validate(department, result);
        if (result.hasErrors()) {
            return "/newDepartment";
        }
        departmentService.createDepartment(department);
        return "redirect:/departments";
    }
}
