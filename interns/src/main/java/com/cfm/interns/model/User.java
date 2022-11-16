package com.cfm.interns.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Person person;

    @Column(name = "people_id", nullable = false)
    private Integer people_id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "hash", nullable = false)
    private String hash;

}