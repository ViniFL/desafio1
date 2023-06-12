package com.vinicius.Orders.services.impl;

import com.vinicius.Orders.entities.Order;
import com.vinicius.Orders.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        Double shippingValue = shippingService.shipment(order);
        Double discount = order.getBasic() * (order.getDiscount() / 100);
        return order.getBasic() - discount + shippingValue;
    }
}
