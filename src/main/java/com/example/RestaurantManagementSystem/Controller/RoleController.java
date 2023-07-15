package com.example.RestaurantManagementSystem.Controller;

import com.example.RestaurantManagementSystem.Model.Role;
import com.example.RestaurantManagementSystem.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/{email}")
    public String addRole( @PathVariable String email , @RequestBody Role role){

        return roleService.addRole(role , email);
    }
}
