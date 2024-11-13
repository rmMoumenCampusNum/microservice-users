package com.ebm.users.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long age;
    private Long driveLicenseNumber;
    private String role = "user";


    public User(long id, String firstName, String lastName, long age, Long driveLicenseNumber, String email, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.driveLicenseNumber = driveLicenseNumber;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {

    }



}
