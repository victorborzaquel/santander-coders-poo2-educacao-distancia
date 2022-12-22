package utils;

import entities.AlunoJava;
import entities.AlunoJs;

import java.util.Arrays;
import java.util.List;

public class TurmaUtils {
    public static List<AlunoJs> criarAlunosJs(String... nomes) {
        return Arrays.stream(nomes).map(AlunoJs::new).toList();
    }
    public static List<AlunoJava> criarAlunosJava(String... nomes) {
        return Arrays.stream(nomes).map(AlunoJava::new).toList();
    }
}
