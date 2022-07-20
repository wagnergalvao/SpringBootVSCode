package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Pessoa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String nome;
}
