package com.shopcart.repositories;

import java.util.List;
import com.shopcart.entities.Product;

public class ProductRepository implements IRepository<Product> {
    @Override
    public Product save(Product entity) {
        // Implementation for saving a product
        return null;
    }

    @Override
    public Product findById(Long id) {
        // Implementation for finding a product by ID
        return null;
    }

    @Override
    public void deleteById(Long id) {
        // Implementation for deleting a product by ID
    }

    @Override
    public List<Product> findAll() {
        // Implementation for finding all products
        return null;
    }
    
}
