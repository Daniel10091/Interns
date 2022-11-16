package com.cfm.interns.dto;

import com.cfm.interns.model.Income;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.Income} entity
 */
@Data
public class IncomeDto implements Serializable {
    private Integer code;
    private String initial_date;
    private String final_date;
    private Integer salary;

    public IncomeDto(Income income) {
        this.code = income.getId();
        this.initial_date = income.getInitial_date();
        this.final_date = income.getFinal_date();
        this.salary = income.getSalary();
    }
}