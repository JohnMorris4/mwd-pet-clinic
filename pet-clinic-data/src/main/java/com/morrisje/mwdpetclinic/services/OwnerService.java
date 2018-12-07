package com.morrisje.mwdpetclinic.services;

import com.morrisje.mwdpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by jmorris on 12/7/18
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();



}
