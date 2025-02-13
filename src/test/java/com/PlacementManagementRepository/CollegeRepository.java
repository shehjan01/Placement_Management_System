package com.PlacementManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementEntity.College;

public interface CollegeRepository extends JpaRepository<College,Long> {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(College college);
	public boolean deleteCollege(long id);
}
