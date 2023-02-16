package com.example.backendcallapi.repository;

import com.example.backendcallapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Zhu Lin on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
