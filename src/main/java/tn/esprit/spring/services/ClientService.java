package tn.esprit.spring.services;
import java.util.List;

import tn.esprit.spring.entities.Client;
public interface ClientService {
	
	/*hehehehehehehehehe xD */
	void ajoutClient(Client client);
	List<Client> listedeClients(Long idBoutique);
	void ajouterAffecterClientBoutiques(Client cl, List<Long> idBoutiques);
}
