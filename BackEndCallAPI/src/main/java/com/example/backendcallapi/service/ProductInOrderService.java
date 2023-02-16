package com.example.backendcallapi.service;


import com.example.backendcallapi.entity.ProductInOrder;
import com.example.backendcallapi.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
