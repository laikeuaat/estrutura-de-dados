package Alunos;

public class Vetor {
    private Alunos[] alunos;
    private int capacidade;
    private int tamanho;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.alunos = new Alunos[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(Alunos aluno) {
        if (tamanho < capacidade) {
            alunos[tamanho] = aluno;
            tamanho++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean contem(Alunos aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

}
