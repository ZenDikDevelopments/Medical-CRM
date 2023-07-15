package com.example.medicalcrm.repositories;

import com.example.medicalcrm.models.entities.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
}
