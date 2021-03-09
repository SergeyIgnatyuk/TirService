package TirService.controller;

import TirService.model.Vehicle;
import TirService.service.VehicleService;
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
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    private final Validator validator;

    @Autowired
    public VehicleController(VehicleService vehicleService, @Qualifier("vehicleValidator") Validator validator) {
        this.vehicleService = vehicleService;
        this.validator = validator;
    }

    @GetMapping
    public String getAllVehicles(ModelMap modelMap) {
        modelMap.addAttribute("vehicles", vehicleService.getAllVehicles());
        return "/vehicles";
    }

    @GetMapping("/new")
    public String getNewVehicleForm(ModelMap modelMap) {
        modelMap.addAttribute("vehicle", Vehicle.builder().build());
        return "/newVehicle";
    }

    @PostMapping("/new")
    public String createVehicle(@ModelAttribute("vehicle") Vehicle vehicle, BindingResult result) {
        validator.validate(vehicle, result);
        if (result.hasErrors()) {
            return "/newVehicle";
        }
        vehicleService.createVehicle(vehicle);
        return "redirect:/vehicles";
    }
}
