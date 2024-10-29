package com.application.hms.service;

import com.application.hms.model.Doctor;
import com.application.hms.model.MedicalRecord;
import com.application.hms.model.Patient;

import java.util.List;

public interface MedicalRecordService {
    int addMedicalRecord(MedicalRecord medicalRecord);
    MedicalRecord getMedicalRecordById(int id);
    List<MedicalRecord> getMedicalRecordByPatientId(int patientId);
}
