package com.longbridge.controller;

import com.longbridge.domain.Address;
import com.longbridge.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/conditional")
    public String conditionalExpression(Model model) {
        Address address = new Address("100 Isaac John","10011" );
        Person person1 = new Person(1,"Mike Doe", address);
        Person person2 = new Person(1,"Ebere Doe", null);
        model.addAttribute("person1", person1);
        model.addAttribute("person2", person2);
        model.addAttribute("gender", "F");
        return "conditional";
    }

    @GetMapping("/iteration")
    public String iterationExpression(Model model) {
        List<Person> people=Arrays.asList(
                new Person(91,"josh"),
                new Person(92,"dele"),
                new Person(93,"sam"),
                new Person(94,"ola")
        );
        model.addAttribute("people",people);
        return "iteration";

    }
}
