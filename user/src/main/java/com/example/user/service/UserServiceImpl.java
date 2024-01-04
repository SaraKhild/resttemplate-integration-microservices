package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.dto.UserDto;
import com.example.user.model.User;
import com.example.user.objectmapper.UserObjectMapper;
import com.example.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserObjectMapper userObjectMapper;

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = this.userRepository.findById(userId).get();
        return this.userObjectMapper.convertToDTO(user);
    }

}
