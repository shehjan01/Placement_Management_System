package com.PlacementManagementService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementEntity.Placement;
import com.PlacementManagementRepository.PlacementRepository;

@Service
public class C_Placement implements PlacementService {
	
	@Autowired
	PlacementRepository repo;

	@Override
	public Placement addPlacement(Placement placement) {
		return repo.save(placement);
	}

	@Override
	public Placement updatePlacement(long id,Placement placement) {
		if(repo.findById(id).isPresent()) {
			repo.save(placement);
		}
		System.out.println("Placement Added Sucessfully");
		return placement;
	}

	@Override
	public Placement searchPlacement(Placement placement,long id) {
		Optional<Placement> result=repo.findById(placement.getId());
		return result.orElse(null);
	}

	@Override
	public boolean cancelPlacement(long id) {
		Optional<Placement> placement = repo.findById(id);
		if (placement.isPresent()) {
			repo.deleteById(id); 
			System.out.println("Placement Cancelled Successfully");
			return true;
		} else {
			System.out.println("Placement Not Found");
			return false;
		}
	}

	@Override
	public List<Placement> getAllPlacements() {	
		return repo.findAll();
	}

	@Override
	public Placement getPlacementById(Long id) {
		if(repo.findById(id) != null) {
			repo.findById(id);
		}
		return null;
	}

}
