package com.PlacementManagementService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementEntity.College;
import com.PlacementEntity.Placement;
import com.PlacementManagementRepository.CollegeRepository;
import com.PlacementManagementRepository.PlacementRepository;

@Service
public class C_CollegeService implements CollegeService {
	@Autowired
	CollegeRepository repo;
	PlacementRepository repo1;
	@Override
	public College addCollege(College college) {
		return repo.save(college);
	}

	@Override
	public College updateCollege(College college,long id) {
		if(repo.findById(id).isPresent()) {
			repo.save(college);
		}
		System.out.println("College Updated");		
		return college;
	}

	@Override
	public College searchCollege(College college) {
		Optional<College> result=repo.findById(college.getId());
		return result.orElse(null);
	}

	@Override
	public boolean deleteCollege(long id) {
		return repo.deleteCollege(id);
	}

	@Override
	public boolean schedulePlacement(Placement placement) {
		try {
			repo1.save(placement);
            System.out.println("Placement Scheduled");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public List<College> getAllColleges() {
		return repo.findAll();
	}

	@Override
	public College getCollegeById(Long id) {
		if(repo.findById(id).isPresent()) {
			repo.findById(id);
		}
		return null;
	}

}
