package com.morrisje.mwdpetclinic.repositories;

import com.morrisje.mwdpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
