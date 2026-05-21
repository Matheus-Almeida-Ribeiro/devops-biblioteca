package com.matheus.devops_biblioteca.service;

import com.matheus.devops_biblioteca.entity.Aluno;
import com.matheus.devops_biblioteca.repository.AlunoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscar(Long rm) {
        return repository.findById(rm).orElse(null);
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void deletar(Long rm) {
        repository.deleteById(rm);
    }
}