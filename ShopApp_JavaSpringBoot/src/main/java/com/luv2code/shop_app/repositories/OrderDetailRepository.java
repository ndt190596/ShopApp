package com.luv2code.shop_app.repositories;

import com.luv2code.shop_app.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
