package tesla.petclinic.model;

public class petType extends BaseEntity {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
