package com.morrisje.mwdpetclinic.repositories;

import com.morrisje.mwdpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypesRepository extends CrudRepository<PetType, Long> {
}
