package TirService.controller;

import TirService.model.Order;
import TirService.service.OrderService;
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
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    private final Validator validator;

    @Autowired
    public OrderController(OrderService orderService, @Qualifier("orderValidator") Validator validator) {
        this.orderService = orderService;
        this.validator = validator;
    }

    @GetMapping
    public String getAllOrders(ModelMap modelMap) {
        modelMap.addAttribute("orders", orderService.getAllOrders());
        return "/orders";
    }

    @GetMapping("/new")
    public String getNewOrderForm(ModelMap modelMap) {
        modelMap.addAttribute("order", Order.builder().build());
        return "/newOrder";
    }

    @PostMapping("/new")
    public String createOrder(@ModelAttribute("order") Order order, BindingResult result) {
        validator.validate(order, result);
        if (result.hasErrors()) {
            return "/newOrder";
        }
        orderService.createOrder(order);
        return "redirect:/orders";
    }
}
