package com.kodilla.hibernate.zad1304;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    List<Employee> findByLastname(@Param("LASTNAME") String lastname);

    List<Employee> findByFewLetters(@Param("ARG") String letters);

}

