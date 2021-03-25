package TirService.validation;

import TirService.model.Vehicle;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class VehicleValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Vehicle.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Vehicle vehicle = (Vehicle) o;

        String number = vehicle.getNumber();
        if (number.isEmpty()) {
            errors.rejectValue("number", "vehicle.number.empty");
        }

        String model = vehicle.getModel();
        if (model.isEmpty()) {
            errors.rejectValue("model", "vehicle.model.empty");
        }

        String vin = vehicle.getVin();
        if (vin.isEmpty()) {
            errors.rejectValue("vin", "vehicle.vin.empty");
        }

        String yearOfIssue = vehicle.getYearOfIssue();
        if (yearOfIssue.isEmpty()) {
            errors.rejectValue("yearOfIssue", "vehicle.yearOfIssue.empty");
        }
    }
}
