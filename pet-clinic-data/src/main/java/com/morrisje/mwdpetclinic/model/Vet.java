package com.morrisje.mwdpetclinic.model;
import java.util.Set;
/**
 * Created by jmorris on 12/5/18
 */
public class Vet extends Person  {
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
