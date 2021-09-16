package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService extends BaseService<Employee> {

    @Autowired
    protected EmployeeService(EmployeeRepository repo) {
        super(repo);
    }
}
