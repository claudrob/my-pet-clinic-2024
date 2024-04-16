package my.edu.mypetclinic.services;

import my.edu.mypetclinic.model.Owner;
import my.edu.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudRepository<Pet, Long> {

}
