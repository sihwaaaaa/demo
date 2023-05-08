package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCotroller {
  @GetMapping
  public String hello(){
    return"hello spring boot";
  }
}
