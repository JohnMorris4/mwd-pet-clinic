package com.morrisje.mwdpetclinic.services.springdatajpa;

import com.morrisje.mwdpetclinic.model.Speciality;
import com.morrisje.mwdpetclinic.repositories.SpecialitiesRepository;
import com.morrisje.mwdpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSpecialitySDJpaService  implements SpecialityService {
    private final SpecialitiesRepository specialitiesRepository;

    public VetSpecialitySDJpaService(SpecialitiesRepository specialitiesRepository) {
        this.specialitiesRepository = specialitiesRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialitiesRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialitiesRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialitiesRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
    specialitiesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    specialitiesRepository.deleteById(aLong);
    }
}
