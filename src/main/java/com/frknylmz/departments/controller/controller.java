package com.frknylmz.departments.controller;

import com.frknylmz.departments.entity.Department;
import com.frknylmz.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class controller {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments/{id}")
    public Optional<Department> getDepartment( @PathVariable("id") Long departmentId){
      return departmentService.getDepartment(departmentId);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @PutMapping("departments/{id}")
    public Department updateDepartment(@RequestBody Department department ,@PathVariable("id") Long departmentId){
        return departmentService.updateDepartment(department,departmentId);
    }
    @DeleteMapping("departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted";
    }
}
