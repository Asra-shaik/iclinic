package com.river.bend.iclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.river.bend.iclinic.models.Sample;
import com.river.bend.iclinic.service.ISampleService;

@RestController
public class HelloWorldController {
	@Autowired
    private ISampleService cityService;

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
   
    @GetMapping("/showCities")
    public String findCities() {

        List<Sample> cities = (List<Sample>) cityService.findAll();
        System.out.println(cities);

//        model.addAttribute("cities", cities);

        return "showCities";
    }
}
