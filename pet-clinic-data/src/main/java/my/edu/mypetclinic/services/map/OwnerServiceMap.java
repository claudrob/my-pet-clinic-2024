package my.edu.mypetclinic.services.map;

import my.edu.mypetclinic.model.Owner;
import my.edu.mypetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;



public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
