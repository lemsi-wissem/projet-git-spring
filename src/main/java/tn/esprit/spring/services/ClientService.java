package tn.esprit.spring.services;
import java.util.List;

import tn.esprit.spring.entities.Client;
public interface ClientService {
	
	void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) ;
	/*hehehehehehehehehe xD */
	void ajoutClient(Client client);
	List<Client> listedeClients(Long idBoutique)

}
