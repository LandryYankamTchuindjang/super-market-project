package cm.cti.serviceutilisateur.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Last name")
    private String lastName;
    @Column(name = "First name")
    private  String firstname;
    @Column(name = "CNI")
    private String cni;
    @Column(name = "Image")
    private String image;
    @Column(name = "Birth day")
    private Date birthday;
}
