package services;

import entities.AlunoJava;
import entities.AlunoJs;

import java.util.Arrays;
import java.util.List;

public class AlunosService {
    public static List<AlunoJava> criarAlunosJava(String... nomes) {
        return Arrays.stream(nomes).map(AlunoJava::new).toList();
    }

    public static List<AlunoJs> criarAlunosJs(String... nomes) {
        return Arrays.stream(nomes).map(AlunoJs::new).toList();
    }
}
