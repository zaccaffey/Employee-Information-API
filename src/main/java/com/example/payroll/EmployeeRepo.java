package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

                                            //   Domain Type, ID Type
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}