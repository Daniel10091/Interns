package com.cfm.interns.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Person person;

    @Column(name = "people_id", nullable = false)
    private Integer people_id;

    @Column(name = "ddd", nullable = false)
    private Integer ddd;

    @Column(name = "number", nullable = false, length = 20)
    private String number;

    @Column(name = "phone_extension", nullable = false, length = 10)
    private String phone_extension;

}