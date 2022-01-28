package com.esteban.demo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.License;
import com.esteban.demo.repositories.LicenseRepository;

@Service
public class LicenseService {

	private final LicenseRepository licenseRepo;

	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepo = licenseRepository;
	}

	//Crear licencia
	public License createLicense(License license) {
		return licenseRepo.save(license);
	}

	//Obteniendo la información de una licencia
	public License findLicense(Long id) {
		Optional<License> optionalLic = licenseRepo.findById(id);
		if (optionalLic.isPresent()) {
			return optionalLic.get();
		} else {
			return null;
		}
	}
}