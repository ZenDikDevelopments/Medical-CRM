package com.example.medicalcrm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {

    private String number;
    private String name;
    private String town;
    private Patient patient;

    public Address() {
    }

    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String streetNumber) {
        this.number = streetNumber;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String streetName) {
        this.name = streetName;
    }

    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @OneToOne
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
