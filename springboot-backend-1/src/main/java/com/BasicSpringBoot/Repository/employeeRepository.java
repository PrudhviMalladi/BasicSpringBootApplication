package com.BasicSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BasicSpringBoot.Modern.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {

}
