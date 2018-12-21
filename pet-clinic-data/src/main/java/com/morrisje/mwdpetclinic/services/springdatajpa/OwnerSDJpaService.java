package com.morrisje.mwdpetclinic.services.springdatajpa;

import com.morrisje.mwdpetclinic.model.Owner;
import com.morrisje.mwdpetclinic.repositories.OwnerRepository;
import com.morrisje.mwdpetclinic.repositories.PetRepository;
import com.morrisje.mwdpetclinic.repositories.PetTypesRepository;
import com.morrisje.mwdpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypesRepository petTypesRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypesRepository petTypesRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypesRepository = petTypesRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
