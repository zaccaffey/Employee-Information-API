package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface repo extends JpaRepository<Department, Long> {

}
