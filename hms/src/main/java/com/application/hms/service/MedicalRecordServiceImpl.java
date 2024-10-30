package com.application.hms.service;

import com.application.hms.model.MedicalRecord;
import com.application.hms.repository.MedicalRecordRepository;

import java.util.List;

public class MedicalRecordServiceImpl implements MedicalRecordService {

    private final MedicalRecordRepository medicalRecordRepository;

    public MedicalRecordServiceImpl(MedicalRecordRepository medicalRecordRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
    }

    @Override
    public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public MedicalRecord getMedicalRecordById(int id) {
        return medicalRecordRepository.findMedicalRecordById(id);
    }

    @Override
    public List<MedicalRecord> getMedicalRecordByPatientId(int patientId) {
        return medicalRecordRepository.findByPatientId(patientId);
    }
}
