package com.example.medicalcrm.repositories;

import com.example.medicalcrm.models.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
