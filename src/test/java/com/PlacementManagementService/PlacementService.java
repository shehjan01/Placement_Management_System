package com.PlacementManagementService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PlacementEntity.Placement;

@Service
public interface PlacementService {
	List<Placement> getAllPlacements();
	public Placement addPlacement(Placement placement);  
	public Placement updatePlacement(long id,Placement placement); 
	public Placement searchPlacement(Placement placemet,long id); 
	public boolean cancelPlacement(long id);
	Placement getPlacementById(Long id); 
}
