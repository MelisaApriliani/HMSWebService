package com.application.hms.controller;

import com.application.hms.model.MedicalRecord;
import com.application.hms.model.Patient;
import com.application.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

//    @PostMapping("/book-appointment")
//    public ResponseEntity<Patient> bookAppointment(@RequestBody AppointmentRequest request) {
//        Patient patient = patientService.bookAppointment(request.getPatient(), request.getDoctorId(), request.getDate());
//        return ResponseEntity.ok(patient);
//    }

//    @GetMapping("/{id}/medical-history")
//    public ResponseEntity<List<MedicalRecord>> viewMedicalHistory(@PathVariable int id) {
//        List<MedicalRecord> history = patientService.viewMedicalHistory(id);
//        return ResponseEntity.ok(history);
//    }

//    @GetMapping("/{id}/medical-documents")
//    public ResponseEntity<List<MedicalRecord>> viewMedicalDocuments(@PathVariable Long id) {
//        List<MedicalRecord> documents = patientService.viewMedicalDocuments(id);
//        return ResponseEntity.ok(documents);
//    }
}