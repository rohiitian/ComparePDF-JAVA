package com.springproject.pdfcompare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.pdfcompare.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Additional methods can be defined here
}
