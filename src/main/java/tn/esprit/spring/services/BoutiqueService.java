package tn.esprit.spring.services;
import java.util.List;

import tn.esprit.spring.entities.Boutique;

public interface BoutiqueService {
	void ajouterEtaffecterListeboutique(List<Boutique> boutiques,int center_id);
}
