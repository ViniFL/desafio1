package com.vinicius.Orders.services.impl;

import com.vinicius.Orders.entities.Order;
import com.vinicius.Orders.services.ShippingService;
import org.springframework.stereotype.Service;

@Service
public class FreteShippingService implements ShippingService {
        @Override
        public Double shipment(Order order) {
            if(order.getBasic() < 100.0) return 20.0;
            else if(order.getBasic() <= 200.0) return 12.0;
            else return 0.0;
        }
}

