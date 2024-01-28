package ru.corp.kafe.service;

import org.springframework.stereotype.Service;
import ru.corp.kafe.model.dto.CheckDTO;
import ru.corp.kafe.model.Order;

import java.util.Random;

@Service
public class OrderService {

    private Random rd = new Random();

   public CheckDTO createOrder(Order order){
        return new CheckDTO(rd.nextInt(), rd.nextInt(10000));
    }

}
