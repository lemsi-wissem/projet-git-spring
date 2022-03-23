package tn.esprit.spring.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) {
		// TODO Auto-generated method stub
		List<Boutique> boutiques = new ArrayList<Boutique>();
		for(Long idboutique:idBoutiques) {
			Boutique b = boutiqueRepo.findById(idboutique);
			boutiques.add(b);
		}
		client.setBoutiques(boutiques);
		clientRepo.save(client);
		
	}

	

}
