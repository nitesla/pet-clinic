package tesla.petclinic.services.map;

import tesla.petclinic.model.Vet;
import tesla.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(final Long id) {
        return findByID(id);
    }

    @Override
    public Vet save(final Vet object) {
        return save(object.getId(), object);
    }

    @Override
    public void delete(final Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);

    }
}
