package com.br.boilerplate.modules.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "TB_USERS")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "TB_NAME")
    private String username;
    @Column(name = "TB_EMAIL")
    private String email;
    @Column(name = "TB_PASSWORD")
    private String password;
}
