package com.example.department.objectmapper;

import org.springframework.stereotype.Component;

import com.example.department.dto.DepartmentDto;
import com.example.department.model.Department;

@Component
public class DepartmentObjectMapper {

    public DepartmentDto convertToDTO(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentAddress(),
                department.getDepartmentCode());

    }

    public Department convertToEntity(DepartmentDto userDTO) {
        // logic to convert UserDTO to User
        return null;
    }

}
