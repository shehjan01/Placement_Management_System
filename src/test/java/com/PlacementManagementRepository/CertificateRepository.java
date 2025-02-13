package com.PlacementManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementEntity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(long id);
	public Certificate deleteCertificate(long id);
}
