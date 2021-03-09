package TirService.controller;

import TirService.model.Employee;
import TirService.service.EmployeeService;
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
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    private final Validator validator;

    @Autowired
    public EmployeeController(EmployeeService employeeService, @Qualifier("employeeValidator") Validator validator) {
        this.employeeService = employeeService;
        this.validator = validator;
    }

    @GetMapping
    public String getAllEmployees(ModelMap modelMap) {
        modelMap.addAttribute("employees", employeeService.getAllEmployees());
        return "/employees";
    }

    @GetMapping("/new")
    public String getNewEmployeeForm(ModelMap modelMap) {
        modelMap.addAttribute("employee", Employee.builder().build());
        return "/newEmployee";
    }

    @PostMapping("/new")
    public String createEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) {
        validator.validate(employee, result);
        if (result.hasErrors()) {
            return "/newEmployee";
        }
        employeeService.createEmployee(employee);
        return "redirect:/employees";
    }
}
