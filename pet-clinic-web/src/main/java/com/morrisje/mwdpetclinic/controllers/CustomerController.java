package com.morrisje.mwdpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmorris on 12/8/18
 */
@Controller
public class CustomerController {

    @RequestMapping({"/customers", "/customers/index", "/customers/index.html"})
    public String listCustomers(){
        return "customers/index";
    }
}
