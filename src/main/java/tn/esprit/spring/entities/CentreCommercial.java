package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CentreCommercial implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nom;
	
	String adresse, login, password;
	
	@OneToMany(mappedBy = "centreCommercial", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	List<Boutique> boutique;
}
