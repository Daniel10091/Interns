package com.cfm.interns.dto;

import com.cfm.interns.model.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.Phone} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto implements Serializable {
    private Integer code;
    private Integer ddd;
    private String number;
    private String phone_extension;
}