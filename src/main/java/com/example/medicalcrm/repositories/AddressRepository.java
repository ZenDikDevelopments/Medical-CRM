package com.example.medicalcrm.repositories;

import com.example.medicalcrm.models.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
