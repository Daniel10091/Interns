package com.cfm.interns.services;

import com.cfm.interns.exception.PersonNotFoundException;
import com.cfm.interns.model.Person;
import com.cfm.interns.repository.PersonRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findPersonByCode(Integer code) {
        return personRepository.findByCode(code)
                .orElseThrow(() -> new PersonNotFoundException("Person by code " + code + " was not found"));
    }

    public Person savePerson(Person person) {
        Person entity = person;
        return personRepository.save(entity);
    }

    public Person updatePerson(Person person) {
        Person entity = person;
        return personRepository.save(entity);
    }

    public void deletePerson(Integer code) {
        personRepository.deletePersonByCode(code);
    }
}
