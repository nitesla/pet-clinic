package tesla.petclinic.services;

import tesla.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);



}
