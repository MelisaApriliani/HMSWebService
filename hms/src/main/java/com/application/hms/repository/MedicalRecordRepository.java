package com.application.hms.repository;

import com.application.hms.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
    MedicalRecord findMedicalRecordById(int id);
    List<MedicalRecord> findByPatientId(int patientId);
}