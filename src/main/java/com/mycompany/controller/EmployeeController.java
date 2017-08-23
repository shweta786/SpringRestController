/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Employee;
import com.mycompany.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SHWETA
 */
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Employee>> list() {
        HttpHeaders headers = new HttpHeaders();
        List<Employee> employees = employeeService.getEmployee();

        if (employees == null) {
            return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
        }
        headers.add("Number Of Records Found", String.valueOf(employees.size()));
        return new ResponseEntity<List<Employee>>(employees, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {

        ModelAndView model = new ModelAndView("employee/employee_form");
        Employee employee = new Employee();
        model.addObject("empForm", employee);
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        HttpHeaders headers = new HttpHeaders();
        if (employee == null) {
            return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
        }
        employeeService.addEmployee(employee);
        headers.add("Employee Created  - ", String.valueOf(employee.getEmp_id()));
        return new ResponseEntity<Employee>(employee, headers, HttpStatus.CREATED);
    }
}
