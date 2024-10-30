package com.application.hms.service;

import com.application.hms.model.Prescription;
import com.application.hms.repository.PrescriptionRepository;

public class PrescriptionServiceImpl implements PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionServiceImpl(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }


    @Override
    public Prescription updatePrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @Override
    public Prescription getPrescription(int prescriptionId) {
        return prescriptionRepository.findPrescriptionById(prescriptionId);
    }
}
