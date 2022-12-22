package utils;

import entities.Turma;

public class Imprima {
    public Imprima() {
        throw new IllegalStateException("Utility class");
    }

    private static final Integer LARGURA = 80;

    public static void divisoria() {
        System.out.println("-".repeat(LARGURA));
    }
    public static void divisoria(String titulo) {
        int largura = (LARGURA - titulo.length()) / 2;
        String linha = "-".repeat(largura);
        System.out.println(linha + titulo.toUpperCase() + linha);
    }
    public static void turma(String titulo, Turma<?> turma) {
        Imprima.divisoria(titulo);
        System.out.println(turma);
        Imprima.divisoria();
    }
}
