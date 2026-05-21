package com.matheus.devops_biblioteca.controller;

import com.matheus.devops_biblioteca.entity.Aluno;
import com.matheus.devops_biblioteca.service.AlunoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")

@Tag(name = "Alunos", description = "CRUD de alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Listar alunos")
    public List<Aluno> listar() {
        return service.listar();
    }

    @GetMapping("/{rm}")
    @Operation(summary = "Buscar aluno")
    public Aluno buscar(@PathVariable Long rm) {
        return service.buscar(rm);
    }

    @PostMapping
    @Operation(summary = "Salvar aluno")
    public Aluno salvar(@RequestBody Aluno aluno) {
        return service.salvar(aluno);
    }

    @DeleteMapping("/{rm}")
    @Operation(summary = "Excluir aluno")
    public void deletar(@PathVariable Long rm) {
        service.deletar(rm);
    }
}