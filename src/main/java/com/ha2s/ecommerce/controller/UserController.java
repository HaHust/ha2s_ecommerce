/*
 * @created 03/09/2021 - 7:38 PM
 * @author vanha
 */

package com.ha2s.ecommerce.controller;

import com.ha2s.ecommerce.entity.user.User;
import com.ha2s.ecommerce.model.dto.UserDto;
import com.ha2s.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

   @GetMapping("/user")
    public List<UserDto> findAllUser(){
       return userService.findAllUser();
   }

   @PostMapping("/user")
    public UserDto saveUser(@RequestBody User user){
       return userService.saveUser(user);
   }
}
