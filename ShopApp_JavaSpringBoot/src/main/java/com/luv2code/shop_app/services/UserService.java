package com.luv2code.shop_app.services;

import com.luv2code.shop_app.dtos.UserDTO;
import com.luv2code.shop_app.exceptions.DataNotFoundException;
import com.luv2code.shop_app.models.User;

public interface UserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password) throws Exception;
}
