package com.example.studentregistration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String username;
    private String password;

    // @OneToOne
    // private Role role;

    // @OneToMany
    // private List<Role> roles;

    @ManyToMany
    private List<Role> roles;
    
}
