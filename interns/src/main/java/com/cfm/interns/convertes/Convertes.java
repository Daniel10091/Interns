package com.cfm.interns.convertes;

import com.cfm.interns.dto.AddressDto;
import com.cfm.interns.dto.EmailDto;
import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.dto.PhoneDto;
import com.cfm.interns.model.Person;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class Convertes {

    public static PersonDto convertPersonDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setCode(person.getId());
        personDto.setName(person.getName());
        personDto.setCpf(person.getCpf());
        personDto.setRg(person.getRg());
        personDto.setMails(person.getMails().stream().map(EmailDto::new).collect(Collectors.toList()));
        personDto.setAddress(person.getAddress().stream().map(AddressDto::new).collect(Collectors.toList()));
        personDto.setPhones(person.getPhones().stream().map(PhoneDto::new).collect(Collectors.toList()));
        return personDto;
    }

    public static List<PersonDto> convertPersonDtoList(List<Person> person) {
        return person.stream().map(Convertes::convertPersonDto).collect(Collectors.toList());
    }

    public static PersonDto convertPerson(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getCode());
        person.setName(personDto.getName());
        person.setCpf(personDto.getCpf());
        person.setRg(personDto.getRg());
        person.setMails(personDto.getMails().stream().map(EmailDto::new).collect(Collectors.toList()));
        person.setAddress(personDto.getAddress().stream().map(AddressDto::new).collect(Collectors.toList()));
        person.setPhones(personDto.getPhones().stream().map(PhoneDto::new).collect(Collectors.toList()));
        return personDto;
    }

    public static List<Person> convertPersonList(List<PersonDto> personDtos) {
        return personDtos.stream().map(Person::new).collect(Collectors.toList());
    }
}
