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

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public Patient bookAppointment(Patient patient, Long doctorId, LocalDateTime date) {
        // Implement the logic for booking an appointment
        return patient;
    }

    @Override
    public List<MedicalRecord> viewMedicalHistory(Long patientId) {
        // Fetch patient's medical history
        return medicalRecordRepository.findByPatientId(patientId);
    }

}
