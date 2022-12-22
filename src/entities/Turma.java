package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma<T extends Aluno> {
    private Professor professor;
    private final List<T> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public Turma(Professor professor, List<T> alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public void adicionarAluno(T aluno) {
        alunos.add(aluno);
    }

    public void adicionarAlunos(List<T> alunos) {
        this.alunos.addAll(alunos);
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
        if (alunos.size() > 0) {
            String materia = alunos.get(0).getEstudando();
            return String.format("Turma={materia=%s, professor=%s, alunos=%s}", materia, professor, alunos);
        }
        return String.format("Turma={professor=%s, alunos=%s}", professor, alunos);
    }
}
