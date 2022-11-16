package com.cfm.interns.dto;

import com.cfm.interns.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cfm.interns.model.User} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private Integer code;
    private String login;
    private String hash;

    public UserDto(User user) {
        this.code = user.getId();
        this.login = user.getLogin();
        this.hash = user.getHash();
    }
}