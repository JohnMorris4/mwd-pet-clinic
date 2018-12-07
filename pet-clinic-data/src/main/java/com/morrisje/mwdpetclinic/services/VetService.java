package com.morrisje.mwdpetclinic.services;

import com.morrisje.mwdpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by jmorris on 12/7/18
 */
public interface VetService {

// TODO Need to implement the Vet methods in the future

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
