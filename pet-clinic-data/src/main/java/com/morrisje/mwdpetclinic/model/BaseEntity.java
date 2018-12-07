package com.morrisje.mwdpetclinic.model;

import java.io.Serializable;

/**
 * Created by jmorris on 12/7/18
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
