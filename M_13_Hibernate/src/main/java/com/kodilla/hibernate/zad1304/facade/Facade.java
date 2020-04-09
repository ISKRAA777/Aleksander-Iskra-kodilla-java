package com.kodilla.hibernate.zad1304.facade;

import com.kodilla.hibernate.zad1304.Company;
import com.kodilla.hibernate.zad1304.CompanyDao;
import com.kodilla.hibernate.zad1304.Employee;
import com.kodilla.hibernate.zad1304.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findEmployee(String name) {
        return employeeDao.findByLastname(name);
    }

    public List<Company> findCompany(String name) {
        return companyDao.findByFewLetters(name);
    }
}
