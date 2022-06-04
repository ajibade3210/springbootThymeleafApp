package com.longbridge.controller;

import com.longbridge.domain.Address;
import com.longbridge.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SImpleExpressionController {

    /*
    * GetMapping to the url link when clicked
    * instantiate Address and Person
    * Use Model as an Argument: this helps
    * Add addAttribute to our simpleExpression page
    * using addAllAttribute Method
    * the return page to be rendered
    * */
    @GetMapping("/simpleExpression")
    public String simpleExpression(Model model){
        Address address = new Address("100 Isaac John","10011" );
        Person person = new Person(1,"Mike Doe", address);
        model.addAttribute("person", person);
        return "simpleExpression";
    }
}
