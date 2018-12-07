package com.morrisje.mwdpetclinic.services.map;

import com.morrisje.mwdpetclinic.model.Vet;
import com.morrisje.mwdpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by jmorris on 12/7/18
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
