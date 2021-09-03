/*
 * @created 03/09/2021 - 7:38 PM
 * @author vanha
 */

package com.ha2s.ecommerce.service;

import com.ha2s.ecommerce.entity.user.User;
import com.ha2s.ecommerce.model.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUser();

    UserDto saveUser(User user);

    UserDto findUserById(int id_user);
}
