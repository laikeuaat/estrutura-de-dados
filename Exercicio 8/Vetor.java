public class Vetor {
    private int[] vetor;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.tamanho = 0;
    }

    public void inserir(int valor) {
        if (this.tamanho < this.capacidade) {
            this.vetor[this.tamanho] = valor;
            this.tamanho++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public void exibir() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println();
    }

    public int buscar(int indice) {
        return vetor[indice];
    }

    public void alterar(int posicao, int valor) {
        if (posicao >= 0 && posicao < this.tamanho) {
            this.vetor[posicao] = valor;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int capacidade() {
        return this.capacidade;
    }
}