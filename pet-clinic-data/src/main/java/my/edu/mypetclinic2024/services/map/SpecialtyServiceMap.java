package my.edu.mypetclinic2024.services.map;

import my.edu.mypetclinic2024.model.Specialty;
import my.edu.mypetclinic2024.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long>  implements SpecialtiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
