package com.cfm.interns.controller;

import com.cfm.interns.convertes.Convertes;
import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.model.Person;
import com.cfm.interns.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/allPeople")
    public List<PersonDto> listAllPeople(Integer code) {
        List<Person> person;
        if (code == null) {
            person = personRepository.findAll();
        } else {
            person = personRepository.findAllByCode();
        }
        return Convertes.convertPersonDto(person);
    }

    @GetMapping("/allCompletePeople")
    public List<Person> listAllCompletePeople() {
        List<Person> people = personRepository.findAll();
        return people;
    }

}
