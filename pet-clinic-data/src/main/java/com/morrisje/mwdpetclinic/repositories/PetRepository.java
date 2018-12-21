package com.morrisje.mwdpetclinic.repositories;

import com.morrisje.mwdpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
