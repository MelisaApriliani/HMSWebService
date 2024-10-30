package com.application.hms.service;

import com.application.hms.model.Doctor;
import com.application.hms.repository.DoctorRepository;

import java.util.List;

public class DoctorServiceImpl implements DoctorService{

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor getDoctorById(int id) {
        return doctorRepository.findByDoctorId(id);
    }


}
