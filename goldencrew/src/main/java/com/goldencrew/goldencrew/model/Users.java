package com.goldencrew.goldencrew.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Setter
@Getter
@Table(name = "users_login")
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
