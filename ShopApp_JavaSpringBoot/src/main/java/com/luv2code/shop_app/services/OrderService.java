package com.luv2code.shop_app.services;

import com.luv2code.shop_app.dtos.OrderDTO;
import com.luv2code.shop_app.exceptions.DataNotFoundException;
import com.luv2code.shop_app.models.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
