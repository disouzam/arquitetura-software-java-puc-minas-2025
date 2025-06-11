package br.com.aulas.projeto.controllers;

import br.com.aulas.projeto.entities.Aluno;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAlunos(@PathVariable @Nullable Integer id) {
        if (id == null) {
            return new ResponseEntity<>("Id não informado", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postAlunos(@RequestBody List<Aluno> alunos) {
        return salvarAlunos(alunos);
    }

    @PatchMapping
    public ResponseEntity<?> patchAlunos(@RequestBody List<Aluno> alunos) {
        return salvarAlunos(alunos);
    }

    private static ResponseEntity<?> salvarAlunos(List<Aluno> alunos) {
        if (alunos == null || alunos.isEmpty()) {
            return new ResponseEntity<>("Lista inválida", HttpStatus.BAD_REQUEST);
        }

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);

            if (aluno.getId() <= 0) {
                return new ResponseEntity<>(String.format("Aluno da linha %s com Id inválido!", i+ 1), HttpStatus.BAD_REQUEST);
            }

            if (aluno.getNome() == null || aluno.getNome() == "") {
                return new ResponseEntity<>(String.format("Aluno da linha %s com Id inválido!", i+ 1), HttpStatus.BAD_REQUEST);
            }
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
