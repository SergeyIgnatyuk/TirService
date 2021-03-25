package TirService.validation;

import TirService.model.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

@Component
public class OrderValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Order.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Order order = (Order) o;

        String service = order.getService();
        if (service.isEmpty()) {
            errors.rejectValue("service", "order.service.empty");
        }

        Date startTime = order.getStartTime();
        if (startTime == null) {
            errors.rejectValue("startTime", "order.startTime.empty");
        }

        Date endTime = order.getEndTime();
        if (endTime == null) {
            errors.rejectValue("endTime", "order.endTime.empty");
        }

        Long vehicleId = order.getVehicleId();
        if (vehicleId == null) {
            errors.rejectValue("vehicleId", "order.vehicleId.empty");
        }

        Long employeeId = order.getEmployeeId();
        if (employeeId == null) {
            errors.rejectValue("employeeId", "order.employeeId.empty");
        }
    }
}
