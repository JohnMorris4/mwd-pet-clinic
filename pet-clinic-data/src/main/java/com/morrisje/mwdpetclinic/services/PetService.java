package com.morrisje.mwdpetclinic.services;

import com.morrisje.mwdpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by jmorris on 12/7/18
 */
public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
