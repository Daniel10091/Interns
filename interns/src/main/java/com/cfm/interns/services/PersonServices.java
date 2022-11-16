package com.cfm.interns.services;

import com.cfm.interns.convertes.Convertes;
import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.model.Person;
import com.cfm.interns.repository.PersonRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonServices {
    private final PersonRepository personRepository;

    public PersonServices (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(PersonDto personDto) {
        Person entity = Convertes.convertPersonDtoList(personDto);
        personRepository.save(entity);
    }
}
