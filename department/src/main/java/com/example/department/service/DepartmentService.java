package com.example.department.service;

import com.example.department.dto.DepartmentDto;
import com.example.department.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    DepartmentDto getDepartmentById(Long departmentId);
}