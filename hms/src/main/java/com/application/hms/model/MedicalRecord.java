package com.application.hms.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private String diagnosis;
    private String treatmentDetails;
    private LocalDateTime date;

    @OneToOne(mappedBy = "medicalRecord", cascade = CascadeType.ALL)
    private Prescription prescription;

    @OneToOne(mappedBy = "medicalRecord", cascade = CascadeType.ALL)
    private MedicalCertificate medicalCertificate;

    @OneToOne(mappedBy = "medicalRecord", cascade = CascadeType.ALL)
    private Invoice invoice;

    // Getters and Setters
}