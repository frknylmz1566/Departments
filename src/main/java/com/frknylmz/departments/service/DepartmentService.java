package com.frknylmz.departments.service;

import com.frknylmz.departments.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Optional<Department> getDepartment( Long departmentId);
    List<Department> fetchDepartmentList();
    Department updateDepartment(Department department,Long departmentId);
    void  deleteDepartmentById(Long departmentId);
}
