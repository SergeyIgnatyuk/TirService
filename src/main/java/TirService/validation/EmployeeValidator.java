package TirService.validation;

import TirService.model.Employee;
import org.flywaydb.core.internal.database.DatabaseExecutionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;

@Component
public class EmployeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Employee.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Employee employee = (Employee) o;

        String fullName = employee.getFullName();
        if (fullName.isEmpty()) {
            errors.rejectValue("fullName", "employee.fullName.empty");
        } else if (fullName.length() < 5) {
            errors.rejectValue("fullName", "employee.fullName.length");
        }

        Date dateOfBirth = employee.getDateOfBirth();
        if (dateOfBirth == null) {
            errors.rejectValue("dateOfBirth", "employee.dateOfBirth.empty");
        }

        String phoneNumber = employee.getPhoneNumber();
        if (phoneNumber.isEmpty()) {
            errors.rejectValue("phoneNumber", "employee.phoneNumber.empty");
        }

        String emailAddress = employee.getEmailAddress();
        if (emailAddress.isEmpty()) {
            errors.rejectValue("emailAddress", "employee.emailAddress.empty");
        }

        String position = employee.getPosition();
        if (position.isEmpty()) {
            errors.rejectValue("position", "employee.position.empty");
        }

        Date dateOfEmployment = employee.getDateOfEmployment();
        if (dateOfEmployment == null) {
            errors.rejectValue("dateOfEmployment", "employee.dateOfEmployment.empty");
        }

    }
}
