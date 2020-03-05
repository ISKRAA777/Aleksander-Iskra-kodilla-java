package com.kodilla.hibernate.zad1304;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    List<Company> findByThreeCharsPrefix(@Param("PREFIX") String prefix);

    List<Company> findByFewLetters(@Param("ARG") String letters);

}

