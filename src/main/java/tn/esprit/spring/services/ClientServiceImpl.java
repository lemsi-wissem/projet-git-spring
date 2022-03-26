package tn.esprit.spring.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Boutique;

import tn.esprit.spring.repositories.ClientRepository;
import tn.esprit.spring.repositories.BoutiqueRepository;

public class ClientServiceImpl implements ClientService  {
	
	@Autowired
	ClientRepository clientRepo;
	
	@Autowired
	BoutiqueRepository boutiqueRepo;

	@Override
	public void ajouterEtAffecterClientBoutiques(Client c, List<Long> boutiques_ids) {
		List<Boutique> boutiques = new ArrayList();
		for(Long id:boutiques_ids) {
			Boutique boutique = boutiqueRepo.findById(id);
			boutiques.add(boutique);
		}
		c.setBoutiques(boutiques);
		clientRepo.save(c);
		
	}

	@Override
	public List<Client> listedeClients(Long idBoutique) {
		Boutique b = boutiqueRepo.findById(idBoutique);
		List<Client> l = b.getClients();
		return l;
	}

}
