package com.kodilla.hibernate.zad1304;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeSearchFacade {
    @Autowired
    private CompanyDao companies;
    @Autowired
    private EmployeeDao employees;

    public List<Company> findCompanies(String letters) {
        return companies.findByFewLetters("%" + letters + "%");
    }

    public List<Employee> findEmployees(String letters) {
        return employees.findByFewLetters("%" + letters + "%");
    }
}