package com.vipas.gquendelibray.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String role;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<User>users;


    public Role(){

    }
    public Role(String role, Collection<User> users) {
        this.role = role;
        this.users = users;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}