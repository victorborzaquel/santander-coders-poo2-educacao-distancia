
import entities.Aluno;
import entities.Professor;
import entities.Turma;

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
