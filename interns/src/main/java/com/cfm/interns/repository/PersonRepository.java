package com.cfm.interns.repository;

import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByCode(Integer code);

    void deletePersonByCode(Integer code);
}