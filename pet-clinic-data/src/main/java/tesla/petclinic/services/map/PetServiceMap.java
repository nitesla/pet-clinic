package tesla.petclinic.services.map;

import tesla.petclinic.model.Pet;
import tesla.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(final Long id) {
        return findByID(id);
    }

    @Override
    public Pet save(final Pet object) {
        return save(object.getId(), object);
    }

    @Override
    public void delete(final Pet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);

    }
}
