package com.application.hms.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MedicalCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateId;

    private String details;
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "medical_record_id")
    private MedicalRecord medicalRecord;

    // Getters and Setters
}
