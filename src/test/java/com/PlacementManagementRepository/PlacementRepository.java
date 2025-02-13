package com.PlacementManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementEntity.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
	public Placement addPlacement(Placement placement);

	public Placement updatePlacement(Placement placement);

	public Placement searchPlacement(long id);
}
