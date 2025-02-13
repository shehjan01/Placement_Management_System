package com.PlacementManagementService;

import java.util.List;

import com.PlacementEntity.Certificate;

public interface CertificateService {
	List<Certificate> getAllCertificates();
	Certificate getCertificateById(Long id);
	void addCertificate(Certificate c);
	void deleteCertificate(Long id);
	void updateCertificate(Long id, Certificate c);
}
