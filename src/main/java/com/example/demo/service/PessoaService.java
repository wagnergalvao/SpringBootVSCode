package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class PessoaService {

  private PessoaRepository pessoaRepository;

  public List<Pessoa> findAll() {
    return pessoaRepository.findAll();
  }
}
