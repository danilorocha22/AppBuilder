package app;

public class Vendedor {
    private long matricula;
    private String nome;

    public Vendedor(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "matrícula: "+ matricula +
                ", nome: "+ nome;
    }

}//classe
