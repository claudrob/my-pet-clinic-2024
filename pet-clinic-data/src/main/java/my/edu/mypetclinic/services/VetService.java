package my.edu.mypetclinic.services;

import my.edu.mypetclinic.model.Owner;
import my.edu.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
