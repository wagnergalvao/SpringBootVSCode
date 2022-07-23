package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Pessoa {

  @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)

  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_pessoas")
  @SequenceGenerator(name = "sequence_id_pessoas", sequenceName = "sequence_pessoa")
  private Long id;
  private String nome;
}
