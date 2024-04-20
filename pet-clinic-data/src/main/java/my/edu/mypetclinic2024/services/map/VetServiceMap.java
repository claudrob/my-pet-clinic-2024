package my.edu.mypetclinic2024.services.map;

import my.edu.mypetclinic2024.model.Specialty;
import my.edu.mypetclinic2024.model.Vet;
import my.edu.mypetclinic2024.services.SpecialtyService;
import my.edu.mypetclinic2024.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(
                    specialty -> {
                        if(specialty.getId() == null){
                            Specialty savedSpecialty = specialtyService.save(specialty);
                            specialty.setId(savedSpecialty.getId());
                        }
                    }
            );
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
