package tesla.petclinic.model;

import java.time.LocalDate;

public class Pet extends petType{
    private petType petType;
    private Owner owner;
    private LocalDate birthDate;

    public tesla.petclinic.model.petType getPetType() {
        return this.petType;
    }

    public void setPetType(final tesla.petclinic.model.petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
