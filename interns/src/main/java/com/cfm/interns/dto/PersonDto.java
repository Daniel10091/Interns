package com.cfm.interns.dto;

import com.cfm.interns.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A DTO for the {@link Person} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto implements Serializable {
    private Integer code;
    private String name;
    private String cpf;
    private String rg;
    private List<EmailDto> mails;
    private List<AddressDto> address;
    private List<PhoneDto> phones;

}