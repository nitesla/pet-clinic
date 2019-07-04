package tesla.petclinic.services.map;

import tesla.petclinic.model.Owner;
import tesla.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(final Long id) {
        return findByID(id);
    }

    @Override
    public Owner save(final Owner object) {
        return save(object.getId(), object);
    }

    @Override
    public void delete(final Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);

    }
}
