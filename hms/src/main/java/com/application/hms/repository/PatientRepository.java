package com.application.hms.repository;

import com.application.hms.model.Appointment;
import com.application.hms.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByPatientId(int patientId);
}
