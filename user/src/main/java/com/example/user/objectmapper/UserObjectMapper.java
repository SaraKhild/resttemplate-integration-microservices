package com.example.user.objectmapper;

import org.springframework.stereotype.Component;

import com.example.user.dto.UserDto;
import com.example.user.model.User;

@Component
public class UserObjectMapper {

    public UserDto convertToDTO(User user) {
        return new UserDto(
                user.getId(),
                user.getDepartmentId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());

    }

    public User convertToEntity(UserDto userDTO) {
        // logic to convert UserDTO to User
        return null;
    }

}
