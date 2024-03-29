package tesla.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>();
    }

    T findByID(final ID id) {
        return this.map.get(id);
    }

    T save(final ID id, final T object){
        this.map.put(id, object);

        return object;
    }

    void deleteById(final ID id) {
        this.map.remove(id);
    }

    void delete(final T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));





    }

}
