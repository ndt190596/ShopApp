package com.luv2code.shop_app.services;

import com.luv2code.shop_app.dtos.ProductDTO;
import com.luv2code.shop_app.dtos.ProductImageDTO;
import com.luv2code.shop_app.models.Product;
import com.luv2code.shop_app.models.ProductImage;
import com.luv2code.shop_app.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;
}
