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

    public void exibir(int posicao) {
        if (posicao >= 0 && posicao < this.tamanho) {
            System.out.println(this.vetor[posicao]);
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }
}