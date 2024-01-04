package com.example.UserWithDepartment.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.UserWithDepartment.model.DepartmentDto;
import com.example.UserWithDepartment.model.ResponseDto;
import com.example.UserWithDepartment.model.UserDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserRestClient {

    @Autowired
    private RestTemplate restTemplate;

    private static String userUrl = "http://localhost:8081/api/user/";
    private static String departmentUrl = "http://localhost:8080/api/departments/";

    public ResponseDto getDeprtmentAndUserByUserId(Long id) {

        ResponseDto responseDto = new ResponseDto();

        ResponseEntity<UserDto> user = restTemplate.getForEntity(userUrl + id, UserDto.class);
        UserDto userDto = user.getBody();
        System.out.println("--------" + "user:" + user.getBody().getDepartmentId());
        log.info("user:" + user.getBody().getDepartmentId());

        ResponseEntity<DepartmentDto> department = restTemplate
                .getForEntity(departmentUrl + user.getBody().getDepartmentId(), DepartmentDto.class);
        DepartmentDto departmentDto = department.getBody();

        responseDto.setUserDto(userDto);
        responseDto.setDepartmentDto(departmentDto);

        return responseDto;

    }

}
