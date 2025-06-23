package com.example.studentregistration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer roleId;
    private String roleName;
    // @OneToOne(mappedBy = "role")
    // private User user;

    // @OneToMany
    // private User user;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
