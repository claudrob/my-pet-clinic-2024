package my.edu.mypetclinic2024.services;

import my.edu.mypetclinic2024.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
