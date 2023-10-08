package cm.cti.serviceutilisateur.entities;

import jakarta.persistence.*;

import java.util.Collection;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @ManyToMany
    private Collection<Role> roles;
}
