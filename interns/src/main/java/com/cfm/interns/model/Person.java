package com.cfm.interns.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "cpf", nullable = false, length = 20)
    private String cpf;

    @Column(name = "rg", nullable = false, length = 20)
    private String rg;

    @MapsId
    @OneToMany(fetch = FetchType.LAZY) // TODO: faz com que o objetos não sejam carregados do banco até que seja preciso
    @JoinColumn(name = "id", referencedColumnName = "person_id", nullable = false)
    private List<Address> address;

    @MapsId
    @OneToMany(fetch = FetchType.LAZY) // TODO: faz com que o objetos não sejam carregados do banco até que seja preciso
    @JoinColumn(name = "id", referencedColumnName = "person_id", nullable = false)
    private List<Email> mails;

    @MapsId
    @OneToMany(fetch = FetchType.LAZY) // TODO: faz com que o objetos não sejam carregados do banco até que seja preciso
    @JoinColumn(name = "id", referencedColumnName = "person_id", nullable = false)
    private List<Phone> phones;
}