package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Employee;

public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {
    //crud
}