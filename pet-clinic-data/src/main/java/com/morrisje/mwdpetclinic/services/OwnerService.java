package com.morrisje.mwdpetclinic.services;

import com.morrisje.mwdpetclinic.model.Owner;

/**
 * Created by jmorris on 12/7/18
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
    

}
