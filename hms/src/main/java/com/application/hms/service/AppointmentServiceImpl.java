package com.application.hms.service;

import com.application.hms.model.Appointment;

import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public Appointment createAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment getAppointmentById(int id) {
        return null;
    }

    @Override
    public List<Appointment> getAppointmentsByDoctorId(int doctorId) {
        return List.of();
    }

    @Override
    public List<Appointment> getAppointmentsByPatientId(int patientId) {
        return List.of();
    }
}
