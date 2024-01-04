package com.example.department.service;

import org.springframework.stereotype.Service;

import com.example.department.dto.DepartmentDto;
import com.example.department.model.Department;
import com.example.department.objectmapper.DepartmentObjectMapper;
import com.example.department.repositroy.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private DepartmentObjectMapper departmentObjectMapper;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public DepartmentDto getDepartmentById(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).get();
        return this.departmentObjectMapper.convertToDTO(department);
    }
}
