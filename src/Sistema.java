
import entities.*;
import utils.TurmaUtils;

import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        Professor professorJava = new Professor("Kadu");
        List<AlunoJava> alunosJava = TurmaUtils.criarAlunosJava("Victor", "Thiago", "Jose");
        Turma<AlunoJava> turmaJava = new Turma<>();
        turmaJava.setProfessor(professorJava);
        turmaJava.adicionarAlunos(alunosJava);

        Professor professorJs = new Professor("Gabriela");
        List<AlunoJs> alunosJs = TurmaUtils.criarAlunosJs("Henrique", "Luana", "Joao");
        Turma<AlunoJs> turmaJs = new Turma<>(professorJs, alunosJs);

        System.out.println(turmaJava);

        turmaJava.ordenarAlunos();
        System.out.println(turmaJava);
    }
}
