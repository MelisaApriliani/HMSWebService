package com.application.hms.repository;

import com.application.hms.model.Appointment;
import com.application.hms.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    Appointment findById(int id);
    List<Appointment> findAppointmentByDoctorId(int doctorId);
    List<Appointment> findAppointmentByPatientId(int patientId);
}
