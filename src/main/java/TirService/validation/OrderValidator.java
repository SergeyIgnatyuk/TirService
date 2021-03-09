package TirService.validation;

import TirService.model.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class OrderValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Order.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
