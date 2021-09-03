/*
 * @created 03/09/2021 - 10:50 PM
 * @author vanha
 */

package com.ha2s.ecommerce.model.mapper;

import com.ha2s.ecommerce.entity.user.User;
import com.ha2s.ecommerce.model.dto.UserDto;
import org.modelmapper.ModelMapper;

public class UserMapper {
    public static UserDto UserToDto(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user,UserDto.class);
    }
}
