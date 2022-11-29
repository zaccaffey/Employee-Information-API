package com.example.payroll;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
class Department {
    private @Id @GeneratedValue Long id;
    private String name;

    @OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
    private List<Employee> workers;

    public List<Employee> getWorkers() {
        return this.workers;
    }

    public void setWorkers(List<Employee> workers) {
        this.workers = workers;
    }

    Department(){}

    Department(String name) {
        this.name = name;
    }

    Department(String name, List<Employee> workers) {
        this.name = name;
        this.workers = workers;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

}
