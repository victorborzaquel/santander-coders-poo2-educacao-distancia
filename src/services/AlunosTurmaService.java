package services;

import entities.Turma;

import java.util.Collections;

public class AlunosTurmaService {
    public static void ordenarAlunosPorNome(Turma<?> turma) {
        Collections.sort(turma.getAlunos());
    }
}
