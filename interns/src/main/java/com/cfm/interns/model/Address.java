package com.cfm.interns.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "people_id", nullable = false)
    private Integer people_id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "cep", nullable = false)
    private Integer cep;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Person person;
}