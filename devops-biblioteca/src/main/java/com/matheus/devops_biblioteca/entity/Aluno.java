package com.matheus.devops_biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_aluno")
public class Aluno {

    @Id
    private Long rmAluno;

    private String nome;

    private String turma;

    public Long getRmAluno() {
        return rmAluno;
    }

    public void setRmAluno(Long rmAluno) {
        this.rmAluno = rmAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}