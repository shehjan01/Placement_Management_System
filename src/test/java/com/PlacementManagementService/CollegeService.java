package com.PlacementManagementService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PlacementEntity.College;
import com.PlacementEntity.Placement;

@Service
public interface CollegeService {
	public College addCollege(College college);
	public College updateCollege(College college,long id);
	public College searchCollege(College college);
	public boolean deleteCollege(long id);
	public boolean schedulePlacement(Placement placement);
	public List<College> getAllColleges();
	public College getCollegeById(Long id);
}
