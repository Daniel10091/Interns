package com.cfm.interns.convertes;

import com.cfm.interns.dto.PhoneDto;
import com.cfm.interns.model.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneConvert {

    public static PhoneDto convertPhoneDto(Phone phone) {
        PhoneDto phoneDto = new PhoneDto();
        phoneDto.setCode(phone.getId());
        phoneDto.setDdd(phone.getDdd());
        phoneDto.setNumber(phone.getNumber());
        phoneDto.setPhone_extension(phone.getPhone_extension());
        return phoneDto;
    }

    public static List<PhoneDto> convertPhoneDtoList(List<Phone> phone) {
        return phone.stream().map(PhoneConvert::convertPhoneDto).collect(Collectors.toList());
    }

    public static Phone convertPhone(PhoneDto phoneDto) {
        Phone phone = new Phone();
        phone.setId(phoneDto.getCode());
        phone.setDdd(phoneDto.getDdd());
        phone.setNumber(phoneDto.getNumber());
        phone.setPhone_extension(phoneDto.getPhone_extension());
        return phone;
    }

    public static List<Phone> convertPhoneList(List<PhoneDto> phoneDto) {
        return phoneDto.stream().map(PhoneConvert::convertPhone).collect(Collectors.toList());
    }

}
