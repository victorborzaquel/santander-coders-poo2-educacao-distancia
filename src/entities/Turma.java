package entities;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno> {
    private Professor professor;
    private final List<T> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    private Turma(Professor professor, List<T> alunos) {
        this.professor = professor;
        this.alunos = alunos;
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
        return String.format("Turma={professor=%s, alunos=%s}", professor, alunos);
    }

    public static class Builder<T extends Aluno> {
        private Professor professor;
        private final List<T> alunos = new ArrayList<>();

        public Builder<T> professor(Professor professor) {
            this.professor = professor;
            return this;
        }

        public Builder<T> adicionarAluno(T aluno) {
            alunos.add(aluno);
            return this;
        }

        public Builder<T> alunos(List<T> alunos) {
            this.alunos.addAll(alunos);
            return this;
        }

        public Turma<T> build() {
            return new Turma<>(professor, alunos);
        }
    }
}
