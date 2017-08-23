/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SHWETA
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    
    @Override
    public List<Employee> getEmployee() {
        String sql = "SELECT * FROM springwithjdbc.employee";
        List<Employee> emp = jdbcTemplate.query(sql, getSource(null), new EmployeeMapper());
        return emp;
    }

    private SqlParameterSource getSource(Employee employee) {
        MapSqlParameterSource src = new MapSqlParameterSource();
        if(employee != null) {
            System.out.println("values  "+employee.getName()+employee.getEmail()+ employee.getGender());
            src.addValue("name", employee.getName());
            src.addValue("email",employee.getEmail());
            src.addValue("gender", employee.getGender());
        }
        return src;
    }
    
    private static final class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int i) throws SQLException {
            Employee employee = new Employee();
            employee.setEmail(rs.getString("email"));
            employee.setGender(rs.getString("gender"));
            employee.setName(rs.getString("name"));
            return employee;
        }
    }
    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO springwithjdbc.employee (name,email,gender) VALUES (:name, :email, :gender)";
      
        jdbcTemplate.update(sql, getSource(employee));
    }
    
}
