package com.morrisje.mwdpetclinic.repositories;

import com.morrisje.mwdpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialitiesRepository extends CrudRepository<Speciality, Long> {
}
