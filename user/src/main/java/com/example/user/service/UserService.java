package com.example.user.service;

import com.example.user.dto.UserDto;
import com.example.user.model.User;

public interface UserService {

    User saveUser(User user);

    UserDto getUserById(Long userId);

}
