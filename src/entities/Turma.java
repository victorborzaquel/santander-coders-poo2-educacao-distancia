package entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Professor professor;
    private final List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public Turma(Professor professor, List<Aluno> alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
