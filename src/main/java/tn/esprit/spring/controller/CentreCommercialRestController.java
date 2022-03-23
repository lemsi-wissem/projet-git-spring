package tn.esprit.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Boutique;
import tn.esprit.spring.entities.CentreCommercial;
import tn.esprit.spring.services.CentreCommercialService;
import tn.esprit.spring.services.BoutiqueService;
import tn.esprit.spring.services.ClientService;



@RestController
@RequestMapping("/data")
public class CentreCommercialRestController {
	@Autowired
	CentreCommercialService centreService;
	
	@Autowired
	BoutiqueService boutiqueService;
	
	@Autowired
	ClientService clientService;
	
	@PostMapping("/add-centre")
	public void ajouterCentre(@RequestBody CentreCommercial centreCommercial) {
		centreService.ajouterCentre(centreCommercial);
	}
	
	@GetMapping("/add-boutique/{centre-id}")
	@ResponseBody
	public List<Boutique> addBoutique(@RequestBody List<Boutique> b, @PathVariable("center-id") int centerId){
		boutiqueService.ajouterEtaffecterListeboutique(b,centerId);
		return b;
	}
	@PostMapping("/add-client")
	public void ajouterClient(@RequestBody Client client,@RequestBody List<Long> b ) {
		clientService.ajouterEtAffecterClientBoutiques(client,b);
	}
	
	@GetMapping("/get-clients/{boutique-id}")
	@ResponseBody
	public List<Client> getClients(@PathVariable("boutique-id") Long boutiqueId){
		List<Client> liste = clientService.listedeClients(boutiqueId);
		return liste;
	}
}
