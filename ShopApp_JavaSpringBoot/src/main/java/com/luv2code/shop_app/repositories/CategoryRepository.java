package com.luv2code.shop_app.repositories;

import com.luv2code.shop_app.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}