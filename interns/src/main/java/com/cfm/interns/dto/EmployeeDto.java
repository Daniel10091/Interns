package com.cfm.interns.dto;

import com.cfm.interns.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.Employee} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto implements Serializable {
    private Integer code;
    private String registration;
    private String name;

    public EmployeeDto(Employee employee) {
        this.code = employee.getId();
        this.registration = employee.getRegistration();
        this.name = employee.getName();
    }
}