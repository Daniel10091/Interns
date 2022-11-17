package com.cfm.interns.convertes;

import com.cfm.interns.dto.AddressDto;
import com.cfm.interns.model.Address;

import java.util.List;
import java.util.stream.Collectors;

public class AddressConvert {

    public static AddressDto convertAddressDto(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setCode(address.getId());
        addressDto.setAddress(address.getAddress());
        addressDto.setDistrict(address.getDistrict());
        addressDto.setState(address.getState());
        addressDto.setCity(address.getCity());
        addressDto.setCep(address.getCep());
        return addressDto;
    }

    public static List<AddressDto> convertAddressDtoList(List<Address> address) {
        return address.stream().map(AddressConvert::convertAddressDto).collect(Collectors.toList());
    }

    public static Address convertAddress(AddressDto addressDto) {
        Address address = new Address();
        address.setAddress(addressDto.getAddress());
        address.setDistrict(addressDto.getDistrict());
        address.setState(addressDto.getState());
        address.setCity(addressDto.getCity());
        address.setCep(addressDto.getCep());
        return address;
    }

    public static List<Address> convertAddressList(List<AddressDto> addressDto) {
        return addressDto.stream().map(AddressConvert::convertAddress).collect(Collectors.toList());
    }

}
