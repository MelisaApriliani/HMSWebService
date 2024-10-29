package com.application.hms.repository;

import com.application.hms.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Doctor findByDoctorId(int doctorId);

}
