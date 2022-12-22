
import entities.Aluno;
import entities.AlunoJs;
import entities.Professor;
import entities.Turma;

import java.util.Arrays;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Professor professor = new Professor("Kadu");
        AlunoJs aluno = new AlunoJs("Victor");
        AlunoJs aluno2 = new AlunoJs("Thiago");
        AlunoJs aluno3 = new AlunoJs("Jose");

        List<AlunoJs> alunos = Arrays.asList(aluno, aluno2, aluno3);

        Turma<AlunoJs> turma = new Turma<>(professor, alunos);

        turma.ordenarAlunos();
        System.out.println(turma);
    }
}
