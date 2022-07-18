package com.river.bend.iclinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.river.bend.iclinic.models.BaseAuth;
import com.river.bend.iclinic.repository.BaseAuthRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  BaseAuthRepository baseAuthRepo;

  @GetMapping("/baseAuth")
  public ResponseEntity<BaseAuth> getAllUsers(@RequestParam(required = false) String email) {
    try {
      List<BaseAuth> users = new ArrayList<BaseAuth>();

      if (email == null)
    	  baseAuthRepo.findAll().forEach(users::add);
      else
      users.add(baseAuthRepo.findUserByEmail(email));
      
      	  System.out.println("----------------getting users");

      users.forEach(user -> System.out.println(user));

      if (users.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      
      ResponseEntity<BaseAuth> resp = new ResponseEntity<>(users.get(0), HttpStatus.OK);
      System.out.println(resp.getBody());
      
      System.out.println(resp);

      return resp;
    } catch (Exception e) {
    	e.printStackTrace();
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
    
    
}
