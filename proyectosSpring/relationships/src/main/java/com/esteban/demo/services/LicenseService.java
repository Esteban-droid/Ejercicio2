package com.esteban.demo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.License;
import com.esteban.demo.repositories.LicenseRepository;



@Service
public class LicenseService {

	private final LicenseRepository licenseRepo;

	private static String newNumber = "000000";

	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}

	//Creando licencia
	public License createLicense(License license) {
		newNumber = String.format("%06d", Integer.parseInt(newNumber) + 1); //nuevo
		license.setNumber(newNumber); //nuevo
		return licenseRepo.save(license);
	}

	//Obteniendo la información de una licencia
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if (optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
}
