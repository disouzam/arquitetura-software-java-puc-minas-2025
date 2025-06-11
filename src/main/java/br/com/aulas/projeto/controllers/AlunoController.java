package br.com.aulas.projeto.controllers;

import br.com.aulas.projeto.entities.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "alunos")
public class AlunoController {

    @GetMapping
    public ResponseEntity<List<Aluno>> getAlunos() {
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno(1, "Aluno 1"));
        alunos.add(new Aluno(2, "Aluno 2"));
        alunos.add(new Aluno(3, "Aluno 3"));

        return new ResponseEntity<List<Aluno>>(alunos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postAlunos() {
        return new ResponseEntity<>("Post Alunos", HttpStatus.OK);
    }
}
