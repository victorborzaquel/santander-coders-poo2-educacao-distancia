package entities;

public abstract class Aluno extends Pessoa {
    private String estudando;
    public Aluno(String nome, String estudando) {
        super(nome);
        this.estudando = estudando;
    }

    public String getEstudando() {
        return estudando;
    }

    public void setEstudando(String estudando) {
        this.estudando = estudando;
    }
}
