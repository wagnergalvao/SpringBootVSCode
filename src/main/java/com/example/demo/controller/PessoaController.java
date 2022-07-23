package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("pessoas")
@AllArgsConstructor
public class PessoaController {

  private PessoaService pessoaService;

  @GetMapping
  public ResponseEntity<?> findAll() {
    List<Pessoa> pessoas = pessoaService.findAll();
    return ResponseEntity.ok(pessoas);
  }

  @PostMapping
  public ResponseEntity<?> save(@RequestBody Pessoa pessoa) {
    Pessoa pessoaAdded = pessoaService.save(pessoa);
    return ResponseEntity.status(HttpStatus.CREATED).body(pessoaAdded);
  }
}
