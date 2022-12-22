package entities;

import java.util.Collections;
import java.util.List;

public class Turma<T extends Aluno> {
    private Professor professor;
    private final List<T> alunos;

    public Turma(List<T> alunos) {
        this.alunos = alunos;
    }

    public Turma(Professor professor, List<T> alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public void adicionarAluno(T aluno) {
        alunos.add(aluno);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<T> getAlunos() {
        return alunos;
    }

    public void ordenarAlunos() {
        Collections.sort(alunos);
    }

    @Override
    public String toString() {
        return "Turma de " + alunos.get(0).getClass().getSimpleName() + " {" +
                "professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
