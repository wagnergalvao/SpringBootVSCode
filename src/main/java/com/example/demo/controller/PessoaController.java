package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PessoaController {

  private PessoaService pessoaService;

  @GetMapping
  public List<Pessoa> findAll() {
    return pessoaService.findAll();
  }
}
