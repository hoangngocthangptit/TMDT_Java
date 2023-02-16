package com.example.backendcallapi.service;



import com.example.backendcallapi.entity.Cart;
import com.example.backendcallapi.entity.ProductInOrder;
import com.example.backendcallapi.entity.User;

import java.util.Collection;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
