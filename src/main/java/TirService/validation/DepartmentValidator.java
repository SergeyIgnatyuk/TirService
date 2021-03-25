package TirService.validation;

import TirService.model.Department;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

@Component
public class DepartmentValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Department.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Department department = (Department) o;

        String name = department.getName();
        if (name.isEmpty()) {
            errors.rejectValue("name", "department.name.empty");
        }

        String description = department.getDescription();
        if (description.isEmpty()) {
            errors.rejectValue("description", "department.description.empty");
        }

        String phoneNumber = department.getPhoneNumber();
        if (phoneNumber.isEmpty()) {
            errors.rejectValue("phoneNumber", "department.phoneNumber.empty");
        }

        Date dateOfFormation = department.getDateOfFormation();
        if (dateOfFormation == null) {
            errors.rejectValue("dateOfFormation", "department.dateOfFormation.empty");
        }
    }
}
