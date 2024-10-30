package com.application.hms.service;

import com.application.hms.model.MedicalRecord;
import com.application.hms.model.Patient;
import com.application.hms.repository.AppointmentRepository;
import com.application.hms.repository.MedicalRecordRepository;
import com.application.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient getPatientById(int id) {
        return patientRepository.findByPatientId(id);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
