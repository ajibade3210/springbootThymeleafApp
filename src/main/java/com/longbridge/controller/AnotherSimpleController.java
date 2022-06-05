package com.longbridge.controller;

import com.longbridge.domain.Address;
import com.longbridge.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnotherSimpleController {

    @GetMapping("/anotherSimpleexp")
    public String anotherSimpleexp(Model model) {
        Address address = new Address("No 75 sanya street", "100012");
        Person person = new Person(2, "Dupe Doe", address);
        model.addAttribute("person", person);
        return "anotherSimpleexp";
    }
}
