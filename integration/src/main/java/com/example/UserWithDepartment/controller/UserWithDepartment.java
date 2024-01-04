package com.example.UserWithDepartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserWithDepartment.client.UserRestClient;
import com.example.UserWithDepartment.model.ResponseDto;

@RestController
@RequestMapping("/user-with-department")
public class UserWithDepartment {

    @Autowired
    private UserRestClient userRestClient;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> userDto(@PathVariable Long id) {
        ResponseDto responseDto = this.userRestClient.getDeprtmentAndUserByUserId(id);
        return ResponseEntity.ok(responseDto);

    }
}
