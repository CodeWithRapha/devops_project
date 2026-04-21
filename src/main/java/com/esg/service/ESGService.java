package com.esg.service;

import com.esg.model.Report;
import com.esg.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ESGService {

 @Autowired
 private ReportRepository repository;

 public int calcularScore(String bairro){

  List<Report> lista = repository.findByBairro(bairro);

  int score = 50;

  for(Report r : lista){
   score += r.getImpacto();
  }

  return score;
 }

}
