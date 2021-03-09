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

    }
}
