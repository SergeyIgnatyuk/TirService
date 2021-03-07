package TirService.controller;

import TirService.model.Vehicle;
import TirService.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
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
}
