package com.cfm.interns.dto;

import com.cfm.interns.model.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.Email} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto implements Serializable {
    private Integer code;
    private String initial_date;
    private String final_date;
}