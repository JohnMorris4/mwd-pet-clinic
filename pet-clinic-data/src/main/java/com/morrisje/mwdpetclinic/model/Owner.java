package com.morrisje.mwdpetclinic.model;

import java.util.Set;

/**
 * Created by jmorris on 12/5/18
 */
public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
