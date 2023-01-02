package com.apurva.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurva.springdatajpamappings.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
