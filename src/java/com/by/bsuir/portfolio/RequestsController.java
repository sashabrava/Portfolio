/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.by.bsuir.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RequestsController {
        @RequestMapping({"/greeting", "/"})
    public String greeting() {
        //model.addAttribute("name", name);
        return "greeting";
    }
}
