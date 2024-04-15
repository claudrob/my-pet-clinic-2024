package my.edu.mypetclinic.services;

import my.edu.mypetclinic.model.Owner;
import my.edu.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
