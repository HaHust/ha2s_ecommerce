/*
 * @created 03/09/2021 - 10:01 PM
 * @author vanha
 */

package com.ha2s.ecommerce.service;

import com.ha2s.ecommerce.entity.user.User;
import com.ha2s.ecommerce.model.dto.UserDto;
import com.ha2s.ecommerce.model.mapper.UserMapper;
import com.ha2s.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDto> findAllUser() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        for(User user:users){
            userDtos.add(UserMapper.UserToDto(user));
        }
        return userDtos;
    }

    @Override
    public UserDto saveUser(User user) {
        user.setCreated_at(LocalDateTime.now());
        user.setPassword("123456");
        User tmp = userRepository.save(user);
        return UserMapper.UserToDto(tmp);
    }

    @Override
    public UserDto findUserById(int id) {
        User tmp = userRepository.findById(id).get();
        return UserMapper.UserToDto(tmp);
    }
}
