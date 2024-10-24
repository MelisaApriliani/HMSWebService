package com.application.hms.service;

import com.application.hms.model.MedicalRecord;
import com.application.hms.model.Patient;

import java.time.LocalDateTime;
import java.util.List;

public interface PatientService {
    Patient bookAppointment(Patient patient, Long doctorId, LocalDateTime date);
    List<MedicalRecord> viewMedicalHistory(Long patientId);

}
