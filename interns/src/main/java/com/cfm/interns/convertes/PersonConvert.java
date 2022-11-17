package com.cfm.interns.convertes;

import com.cfm.interns.dto.PersonDto;
import com.cfm.interns.model.Person;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class PersonConvert {

    public static PersonDto convertPersonDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setCode(person.getId());
        personDto.setName(person.getName());
        personDto.setCpf(person.getCpf());
        personDto.setRg(person.getRg());
        personDto.setMails(person.getMails().stream().map(EmailConvert::convertEmailDto).collect(Collectors.toList()));
        personDto.setAddress(person.getAddress().stream().map(AddressConvert::convertAddressDto).collect(Collectors.toList()));
        personDto.setPhones(person.getPhones().stream().map(PhoneConvert::convertPhoneDto).collect(Collectors.toList()));
        return personDto;
    }

    public static List<PersonDto> convertPersonDtoList(List<Person> person) {
        return person.stream().map(PersonConvert::convertPersonDto).collect(Collectors.toList());
    }

    public static Person convertPerson(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getCode());
        person.setName(personDto.getName());
        person.setCpf(personDto.getCpf());
        person.setRg(personDto.getRg());
        person.setMails(personDto.getMails().stream().map(EmailConvert::convertEmail).collect(Collectors.toList()));
        person.setAddress(personDto.getAddress().stream().map(AddressConvert::convertAddress).collect(Collectors.toList()));
        person.setPhones(personDto.getPhones().stream().map(PhoneConvert::convertPhone).collect(Collectors.toList()));
        return person;
    }

    public static List<Person> convertPersonList(List<PersonDto> personDto) {
        return personDto.stream().map(PersonConvert::convertPerson).collect(Collectors.toList());
    }

}
