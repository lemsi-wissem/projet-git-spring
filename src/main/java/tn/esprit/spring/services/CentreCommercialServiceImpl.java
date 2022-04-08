package tn.esprit.spring.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CentreCommercial;
import tn.esprit.spring.repositories.CentreCommercialRepository;

@Service
public class CentreCommercialServiceImpl implements CentreCommercialService {
	
	@Autowired
	CentreCommercialRepository centreRepo;

	@Override
	public void addCenter(CentreCommercial centre) {
		centreRepo.save(centre);
		System.out.println("Center Added Successfully");
		//commentaire oussema 2
		

	}

}
