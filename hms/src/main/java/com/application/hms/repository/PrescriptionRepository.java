package com.application.hms.repository;

import com.application.hms.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer>  {
    Prescription findPrescriptionById(int id);
}
