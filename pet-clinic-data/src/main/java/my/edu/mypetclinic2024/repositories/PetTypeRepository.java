package my.edu.mypetclinic2024.repositories;

import my.edu.mypetclinic2024.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
