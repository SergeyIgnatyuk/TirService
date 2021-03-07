package TirService.controller;

import TirService.model.Order;
import TirService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
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
}
