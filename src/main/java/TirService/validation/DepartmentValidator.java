package TirService.validation;

import TirService.model.Department;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class DepartmentValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Department.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Department department = (Department) o;
    }
}
