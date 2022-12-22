package services;

import entities.Turma;
import models.Aluno;

import java.util.Collections;
import java.util.List;

public class AlunosTurmaService {
    public static void ordenarAlunosPorNome(Turma<?> turma) {
        Collections.sort(turma.getAlunos());
    }

    public static <T extends Aluno> void adicionarAluno(Turma<T> turma, T aluno) {
        turma.getAlunos().add(aluno);
    }

    public static <T extends Aluno> void adicionarAlunos(Turma<T> turma, List<T> alunos) {
        turma.getAlunos().addAll(alunos);
    }

}
