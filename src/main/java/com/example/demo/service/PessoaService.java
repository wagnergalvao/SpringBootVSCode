package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class PessoaService {

  private PessoaRepository pessoaRepository;

  @Transactional(readOnly = true)
  public List<Pessoa> findAll() {
    return pessoaRepository.findAll();
  }

  public Pessoa save(Pessoa pessoa) {
    return pessoaRepository.save(pessoa);
  }
}
