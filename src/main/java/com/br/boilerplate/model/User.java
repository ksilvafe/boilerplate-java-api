package com.br.boilerplate.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USER")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "TB_NAME")
    private String name;
    @Column(name = "TB_EMAIL")
    private String email;
    @Column(name = "TB_PASSWORD")
    private String password;

}
