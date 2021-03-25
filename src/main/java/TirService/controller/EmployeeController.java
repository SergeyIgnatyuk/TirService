package TirService.controller;

import TirService.model.Employee;
import TirService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String findAllEmployees(ModelMap modelMap) {
        modelMap.addAttribute("employees", employeeService.findAllEmployees());
        return "/employees";
    }

    @GetMapping("/{id}")
    public String getOneEmployee(@PathVariable Long id, ModelMap modelMap) {
        modelMap.addAttribute("employee", employeeService.getOneEmployeeById(id));
        return "/employee";
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

    @GetMapping("/{id}/delete")
    public String deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees";
    }

    @GetMapping("/free/{departmentId}")
    public String getAddEmployeeToDepartmentForm(@PathVariable Long departmentId, ModelMap modelMap) {
        modelMap.addAttribute("employees", employeeService.getAllEmployeesWhichDoNotBelongToAnyDepartment());
        modelMap.addAttribute("departmentId", departmentId);
        return "/freeEmployees";
    }

    @PostMapping("/{employeeId}")
    public String addEmployeeToDepartment(@PathVariable Long employeeId,
                                          @RequestParam Long departmentId,
                                          RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("departmentId", departmentId);
        employeeService.addEmployeeToDepartment(employeeId, departmentId);
        return "redirect:/employees/free/{departmentId}";
    }

    @GetMapping("/{employeeId}/department/delete")
    public String removeEmployeeFromDepartment(@PathVariable Long employeeId,
                                               RedirectAttributes redirectAttributes) {
        Employee employee = employeeService.getOneEmployeeById(employeeId);
        redirectAttributes.addAttribute("departmentId", employee.getDepartmentId());
        employeeService.removeEmployeeFromDepartment(employeeId);
        return "redirect:/departments/{departmentId}";
    }
}
