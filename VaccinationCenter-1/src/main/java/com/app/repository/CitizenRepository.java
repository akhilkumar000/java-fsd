package com.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Citizen;
import com.app.entity.VaccineCenter;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
	List<Citizen> findByVaccinationCenter(VaccineCenter vaccinationCenter);
}
