package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController extends BaseController<Employee>{

    @Autowired
    public EmployeeController(EmployeeService service) {
        super(service);
    }
}
