package app.spring.patient_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.spring.patient_management_system.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
