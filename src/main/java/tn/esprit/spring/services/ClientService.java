package tn.esprit.spring.services;
import java.util.List;

import tn.esprit.spring.entities.Client;
public interface ClientService {
	
	void ajouterEtAffecterClientBoutiques(Client client, List<Long> boutiques_ids) ;
	List<Client> listedeClients(Long boutique_id);

}
