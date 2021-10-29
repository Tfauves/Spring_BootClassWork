package com.careerdevs.employeeClassWork;

import com.careerdevs.employeeClassWork.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}


