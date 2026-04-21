package com.esg.controller;

import com.esg.service.ESGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/esg")
public class ESGController {

 @Autowired
 private ESGService service;

 @GetMapping("/score/{bairro}")
 public int score(@PathVariable String bairro){
  return service.calcularScore(bairro);
 }

 @GetMapping("/health")
 public String health(){
  return "API OK";
 }

}
