package tn.esprit.spring.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Boutique;

@Repository
public interface BoutiqueRepository extends CrudRepository<Boutique,Integer> {

	Boutique findById(Long idboutique);

}
