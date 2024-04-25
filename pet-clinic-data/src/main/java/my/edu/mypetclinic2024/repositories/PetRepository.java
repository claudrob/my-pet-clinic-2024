package my.edu.mypetclinic2024.repositories;

import my.edu.mypetclinic2024.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
