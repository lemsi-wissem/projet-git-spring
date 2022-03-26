package tn.esprit.spring.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Boutique;
import tn.esprit.spring.entities.CentreCommercial;

import tn.esprit.spring.repositories.BoutiqueRepository;
import tn.esprit.spring.repositories.CentreCommercialRepository;

@Service
public class BoutiqueServiceImpl implements BoutiqueService {
	
	@Autowired
	BoutiqueRepository boutiqueRepo;
	
	@Autowired
	CentreCommercialRepository centreRepo;
	
	@Override
	public void ajouterEtaffecterListeboutique(List<Boutique> lb, int idCentre) {
		// TODO Auto-generated method stub
		CentreCommercial c = centreRepo.findById(idCentre).orElse(null);
		for(Boutique boutique:lb) {
			boutique.setCentreCommercial(c);
			boutiqueRepo.save(boutique);
		}
	}
	public void ajoutBoutique(Boutique b){
		boutiqueRepo.save(b);
	}

}
