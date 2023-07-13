package com.example.medicalcrm.repositories;

import com.example.medicalcrm.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
