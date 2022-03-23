package tn.esprit.spring.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {

}
