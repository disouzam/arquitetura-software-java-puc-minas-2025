package br.com.aulas.projeto.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Aluno {
    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    private int id;
    private String nome;
}
