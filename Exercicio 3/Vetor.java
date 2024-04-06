package Alunos;

public class Vetor implements IvetorAlunos {
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
        } else if (cheio()) {
            aumentarCapacidade();
            alunos[tamanho] = aluno;
            tamanho++;
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

    public void remover(Alunos aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].equals(aluno)) {
                for (int j = i; j < tamanho - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }

    public void aumentarCapacidade() {
        Alunos[] novoVetor = new Alunos[capacidade * 2];
        for (int i = 0; i < tamanho; i++) {
            novoVetor[i] = alunos[i];
        }
        alunos = novoVetor;
        capacidade *= 2;
    }

    public boolean cheio() {
        return tamanho == capacidade;
    }

}
