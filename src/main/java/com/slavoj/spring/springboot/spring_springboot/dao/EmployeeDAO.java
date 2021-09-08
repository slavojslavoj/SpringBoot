package com.slavoj.spring.springboot.spring_springboot.dao;

import com.slavoj.spring.springboot.spring_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
