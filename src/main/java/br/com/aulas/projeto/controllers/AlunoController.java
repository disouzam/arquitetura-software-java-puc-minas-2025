package br.com.aulas.projeto.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "alunos")
public class AlunoController {

    @GetMapping
    public ResponseEntity<?> recuperaListaAlunos() {
        return new ResponseEntity<>("Get Alunos", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postAlunos() {
        return new ResponseEntity<>("Post Alunos", HttpStatus.OK);
    }
}
