package com.application.hms.service;

import com.application.hms.model.Prescription;

public interface PrescriptionService {

    Prescription createPrescription(Prescription prescription);
    Prescription updatePrescription(Prescription prescription);
    Prescription getPrescription(int prescriptionId);
}
