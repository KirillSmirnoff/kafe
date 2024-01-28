package ru.corp.kafe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.corp.kafe.model.dto.CheckDTO;
import ru.corp.kafe.model.Order;
import ru.corp.kafe.service.OrderService;

@Controller
public class ClientController {

    private OrderService service;

    public ClientController(OrderService service) {
        this.service = service;
    }

    @PostMapping(value = "/kafe/order")
    public CheckDTO createOrder(@RequestBody Order order){
        return service.createOrder(order);
    }
}
