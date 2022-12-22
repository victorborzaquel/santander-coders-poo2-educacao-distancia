package entities;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno> {
    private Professor professor;
    private final List<T> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public Turma(Professor professor, List<T> alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public void adicionarAluno(T t) {
        alunos.add(t);
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

    @Override
    public String toString() {
        return "Turma de " + alunos.get(0).getClass().getSimpleName() + " {" +
                "professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
