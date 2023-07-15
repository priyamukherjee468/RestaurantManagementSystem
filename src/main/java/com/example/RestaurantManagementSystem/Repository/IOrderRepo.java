package com.example.RestaurantManagementSystem.Repository;


import com.example.RestaurantManagementSystem.Model.Food;
import com.example.RestaurantManagementSystem.Model.Order;
import com.example.RestaurantManagementSystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
