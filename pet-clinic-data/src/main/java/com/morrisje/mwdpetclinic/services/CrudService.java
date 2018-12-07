package com.morrisje.mwdpetclinic.services;

import java.util.Set;

/**
 * Created by jmorris on 12/7/18
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
