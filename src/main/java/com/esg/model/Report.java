package com.esg.model;

import jakarta.persistence.*;

@Entity
public class Report {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String bairro;
 private String tipo;
 private String descricao;
 private int impacto;

 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public String getBairro() { return bairro; }
 public void setBairro(String bairro) { this.bairro = bairro; }

 public String getTipo() { return tipo; }
 public void setTipo(String tipo) { this.tipo = tipo; }

 public String getDescricao() { return descricao; }
 public void setDescricao(String descricao) { this.descricao = descricao; }

 public int getImpacto() { return impacto; }
 public void setImpacto(int impacto) { this.impacto = impacto; }

}
