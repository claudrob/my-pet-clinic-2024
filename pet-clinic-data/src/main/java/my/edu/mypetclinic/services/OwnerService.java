package my.edu.mypetclinic.services;

import my.edu.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService  extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
