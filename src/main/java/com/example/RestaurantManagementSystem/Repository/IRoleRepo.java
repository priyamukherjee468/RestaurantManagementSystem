package com.example.RestaurantManagementSystem.Repository;


import com.example.RestaurantManagementSystem.Model.Food;
import com.example.RestaurantManagementSystem.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleRepo extends JpaRepository<Role, Long> {

}
