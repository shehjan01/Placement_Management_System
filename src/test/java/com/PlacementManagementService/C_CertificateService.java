package com.PlacementManagementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementEntity.Certificate;
import com.PlacementManagementRepository.CertificateRepository;

@Service
public class C_CertificateService implements CertificateService {
	@Autowired
	CertificateRepository repo;
	@Override
	public List<Certificate> getAllCertificates() {
		return repo.findAll();
	}

	@Override
	public Certificate getCertificateById(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void addCertificate(Certificate c) {
		repo.save(c);
	}

	@Override
	public void deleteCertificate(Long id) {
		repo.deleteById(id);
	}

	@Override
	public void updateCertificate(Long id, Certificate c) {
		if(repo.existsById(id)) {
			c.setId(id);
			repo.save(c);
		}
	}

}
