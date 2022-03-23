package tn.esprit.spring.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CentreCommercial;
import tn.esprit.spring.repositories.CentreCommercialRepository;

@Service
public class CentreCommercialServiceImpl implements CentreCommercialService {
	
	@Autowired
	CentreCommercialRepository centreRepository;

	@Override
	public void ajouterCentre(CentreCommercial centre) {
		// TODO Auto-generated method stub
		centreRepository.save(centre);
		//commentaire oussema 2
		
	}

}
