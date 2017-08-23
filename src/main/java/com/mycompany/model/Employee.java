/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author SHWETA
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    private int emp_id;
    private String name;
    private String email;
    private String gender;

    @JsonCreator
    public Employee(@JsonProperty("emp_id") int emp_id,
            @JsonProperty("name") String name,
            @JsonProperty("email") String email,
            @JsonProperty("gender") String gender) {
        this.emp_id = emp_id;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Employee() {

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Employee Id:- " + getEmp_id());
        str.append(" Name:- " + getName());
        str.append(" Email:- " + getEmail());
        str.append(" Gender:- " + getGender());
        return str.toString();
    }
}
