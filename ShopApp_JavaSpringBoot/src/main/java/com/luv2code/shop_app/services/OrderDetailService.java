package com.luv2code.shop_app.services;

import com.luv2code.shop_app.dtos.OrderDetailDTO;
import com.luv2code.shop_app.exceptions.DataNotFoundException;
import com.luv2code.shop_app.models.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);


}
