/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Employee;
import java.util.List;

/**
 *
 * @author SHWETA
 */
public interface EmployeeService {
    public List<Employee> getEmployee();
    public void addEmployee(Employee employee);
}
