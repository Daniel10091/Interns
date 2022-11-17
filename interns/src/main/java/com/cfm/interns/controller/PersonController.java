package com.cfm.interns.controller;

import com.cfm.interns.convertes.PersonConvert;
import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.model.Person;
import com.cfm.interns.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    @GetMapping("/buscar")
//    public List<PersonDto> listAllPeople(Integer code) {
//        List<Person> people;
//        if (code == null) {
//            people = personService.findAll();
//        } else {
//            people = (List<Person>) personService.findPersonByCode(code);
//        }
//        return PersonConvert.convertPersonDtoList(people);
//    }

    @GetMapping("/todos")
    public ResponseEntity<List<PersonDto>> listAllPeople() {
        List<Person> people = personService.findAll();
        return ResponseEntity.ok(PersonConvert.convertPersonDtoList(people));
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<PersonDto> savePerson(@RequestBody PersonDto personDto) {
        Person newPerson = personService.savePerson(PersonConvert.convertPerson(personDto));
        return new ResponseEntity<>(PersonConvert.convertPersonDto(newPerson), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<PersonDto> updatePerson(@RequestBody PersonDto personDto) {
        Person newPerson = personService.updatePerson(PersonConvert.convertPerson(personDto));
        return new ResponseEntity<>(PersonConvert.convertPersonDto(newPerson), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{code}")
    public ResponseEntity<?> deletePerson(@PathVariable("code") Integer code) {
        personService.deletePerson(code);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
