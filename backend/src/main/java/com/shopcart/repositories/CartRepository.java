package com.shopcart.repositories;

import java.util.List;

import com.shopcart.entities.Cart;

public class CartRepository implements IRepository<Cart> {
    @Override
    public Cart save(Cart entity) {
        // Implementation for saving a cart
        return null;
    }

    @Override
    public Cart findById(Long id) {
        // Implementation for finding a cart by ID
        return null;
    }

    @Override
    public void deleteById(Long id) {
        // Implementation for deleting a cart by ID
    }

    @Override
    public List<Cart> findAll() {
        // Implementation for finding all carts
        return null;
    }
}