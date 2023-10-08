package cm.cti.serviceutilisateur.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "E-mail")
    private String email;
    @Column(name = "Pays")
    private String country;
    @Column(name = "Region")
    private  String region;
    @Column(name = "City")
    private  String city;
    @Column(name = "Quarter")
    private String quarter;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Postal-Box")
    private  String postalBox;
}
