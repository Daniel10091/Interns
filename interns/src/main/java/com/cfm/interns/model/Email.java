package com.cfm.interns.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "email")
public class Email {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Person person;

    @Column(name = "people_id", nullable = false)
    private Integer people_id;

    @Column(name = "initial_date", nullable = false, length = 20)
    private String initial_date;

    @Column(name = "final_date", nullable = false, length = 20)
    private String final_date;

}