package com.application.hms.model;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private String dateOfBirth;

    @ElementCollection
    private List<String> medicalHistory;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    private List<MedicalRecord> medicalRecords;

    // Getters and Setters

    // Business logic methods will be handled in services
}
