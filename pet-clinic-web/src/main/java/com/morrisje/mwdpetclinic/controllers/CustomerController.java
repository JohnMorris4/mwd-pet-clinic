package com.morrisje.mwdpetclinic.controllers;

import com.morrisje.mwdpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmorris on 12/8/18
 */
@RequestMapping("/customers")
@Controller
public class CustomerController {

    private final OwnerService ownerService;

    public CustomerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listCustomers(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "customers/index";
    }
}
