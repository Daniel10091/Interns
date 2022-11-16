package com.cfm.interns.dto;

import com.cfm.interns.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.Address} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto implements Serializable {
    private Integer code;
    private String address;
    private String district;
    private String state;
    private String city;
    private Integer cep;

    public AddressDto(Address address) {
        this.code = address.getId();
        this.address = address.getAddress();
        this.district = address.getDistrict();
        this.state = address.getState();
        this.city = address.getCity();
        this.cep = address.getCep();
        this.district = address.getDistrict();
    }
}