package com.cfm.interns.convertes;

import com.cfm.interns.dto.EmailDto;
import com.cfm.interns.model.Email;

import java.util.List;
import java.util.stream.Collectors;

public class EmailConvert {

    public static EmailDto convertEmailDto(Email email) {
        EmailDto emailDto = new EmailDto();
        emailDto.setCode(email.getId());
        emailDto.setInitial_date(email.getInitial_date());
        emailDto.setFinal_date(email.getFinal_date());
        return emailDto;
    }

    public static List<EmailDto> convertEmailDtoList(List<Email> email) {
        return email.stream().map(EmailConvert::convertEmailDto).collect(Collectors.toList());
    }

    public static Email convertEmail(EmailDto emailDto) {
        Email email = new Email();
        email.setId(emailDto.getCode());
        email.setInitial_date(emailDto.getInitial_date());
        email.setFinal_date(emailDto.getFinal_date());
        return email;
    }

    public static List<Email> convertEmailList(List<EmailDto> emailDto) {
        return emailDto.stream().map(EmailConvert::convertEmail).collect(Collectors.toList());
    }

}
