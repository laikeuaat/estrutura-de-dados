package Exercicio 4;

public class Alunos {
    private String nome;
    private int idade;
    private double nota;
    private Alunos proximo;
    public Alunos(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.proximo = null;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getNota() {
        return nota;
    }
    public Alunos getProximo() {
        return proximo;
    }
    public void setProximo(Alunos aluno) {
        this.proximo = aluno;
    }

}
