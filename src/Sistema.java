package com.letscode.santander.coders.poo2.aula.a02;

import com.letscode.santander.coders.poo2.aula.a02.entities.Aluno;
import com.letscode.santander.coders.poo2.aula.a02.entities.Professor;
import com.letscode.santander.coders.poo2.aula.a02.entities.Turma;

import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        List<Aluno> alunos = List.of(aluno, aluno2, aluno3);

        Turma turma = new Turma(professor, alunos);
    }
}
