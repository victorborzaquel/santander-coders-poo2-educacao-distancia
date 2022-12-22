
import entities.*;
import services.AlunosService;
import services.AlunosTurmaService;
import utils.Imprima;

import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        List<AlunoJava> alunosJava = AlunosService.criarAlunosJava("Victor", "Thiago", "Jose");
        Turma<AlunoJava> turmaJava = new Turma.Builder<AlunoJava>()
                .professor(new Professor("Kadu"))
                .alunos(alunosJava)
                .build();

        List<AlunoJs> alunosJs = AlunosService.criarAlunosJs("Joao", "Leomin", "Bruna");
        Turma<AlunoJs> turmaJs = new Turma<>();
        turmaJs.setProfessor(new Professor("Gabriela"));
        AlunosTurmaService.adicionarAlunos(turmaJs, alunosJs);

        AlunosTurmaService.ordenarAlunosPorNome(turmaJava);

        Imprima.turma("java", turmaJava);
        Imprima.turma("javascript", turmaJs);
    }
}
