package com.matheus.devops_biblioteca.repository;

import com.matheus.devops_biblioteca.entity.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}