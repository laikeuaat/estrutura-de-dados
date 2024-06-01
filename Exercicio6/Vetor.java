public class Vetor {
    private int vetor[];
    private int tamanho;
    private int capacidadeMax;
    private int maior;

    /*
     * Construtor da classe Vetor
     */
    public Vetor(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
        vetor = new int[this.capacidadeMax];
        tamanho = 0;
    }

    /*
     * Adiciona um item ao vetor
     * 
     * @param item - item a ser adicionado ao vetor
     */
    public void adicionaItem(int item) {
        if (tamanho >= capacidadeMax) {
            System.out.println("Esse vetor esta cheioo '-'");
        } else {
            vetor[tamanho] = item;
            tamanho++;
        }
    }

    /*
     * Mostra o vetor
     */
    public void mostrarVetor() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
        }
    }

    /*
     * Verifica o maior valor do vetor de forma recursiva
     * 
     * @param num - posição do vetor
     */
    private void verificarMaiorRecursivo(int num) {
        if (num == tamanho) {
            return;
        } else {
            if (num == 0) {
                maior = vetor[num];
            } else {
                if (vetor[num] > maior) {
                    maior = vetor[num];
                }
            }
            verificarMaiorRecursivo(num + 1);
        }
    }

    /*
     * Aciona o método verificarMaiorRecursivo
     * 
     * @return maior - maior valor do vetor
     */
    public int maiorRecursivo() {
        verificarMaiorRecursivo(0);
        return maior;

    }

    /*
     * Verifica o maior valor do vetor de forma iterativa
     * 
     * @return maior - maior valor do vetor
     */
    public int maiorIterativo() {
        for (int i = 0; i < tamanho; i++) {
            if (i == 0) {
                maior = vetor[i];
            } else {
                if (vetor[i - 1] > vetor[i] && vetor[i - 1] > maior) {
                    maior = vetor[i - 1];
                } else if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
        }
        return maior;
    }
}
