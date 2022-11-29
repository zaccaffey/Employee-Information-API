package com.example.payroll;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository, repo repo) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "Advisor")));
      log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "Accountant")));
      log.info("Preloading " + repo.save(new Department("Finance", Arrays.asList(new Employee("Frodo", "Baggins", "Accountant"), new Employee("Bilbo", "Baggins", "Advisor")))));
      log.info("Preloading " + repo.save(new Department("IT", Arrays.asList(new Employee("John", "Smith", "Web Developer"), new Employee("Carlos", "Sanchez", "Pen-Tester")))));
      log.info("Preloading " + repo.save(new Department("HR", Arrays.asList(new Employee("Becky", "Hyde", "HR Officer"), new Employee("Jessica", "Fry", "Director of HR")))));
    };
  }

  @Bean
  boolean Test() {
    log.info("This has run");
    return true;
  }
}