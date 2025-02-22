package com.luv2code.shop_app.services;


import com.luv2code.shop_app.dtos.CategoryDTO;
import com.luv2code.shop_app.models.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryDTO categoryDTO);

    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
