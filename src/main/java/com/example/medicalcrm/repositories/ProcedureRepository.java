package com.example.medicalcrm.repositories;

import com.example.medicalcrm.entities.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
}
