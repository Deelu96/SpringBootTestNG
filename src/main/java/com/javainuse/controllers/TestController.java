package com.javainuse.controllers;

import com.javainuse.model.Auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId("1");
        emp.setSalary(3000);

        return emp;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Auth secondPage() {
        
        Auth login = new Auth();
        login.setUsername("Deelaka");
        login.setPassword("ABCD");

        return login;
    }
}
