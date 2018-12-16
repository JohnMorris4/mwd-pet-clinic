package com.morrisje.mwdpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmorris on 12/7/18
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "/index.html"})
    public String index(){

        return "index";
    }

    @RequestMapping({"/error", "/oups"})
    public String error(){
        return "notimplemented";
    }


}
