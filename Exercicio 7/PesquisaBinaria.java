public class PesquisaBinaria {
    private int inicio;
    private int fim;

    public PesquisaBinaria(int fim) {
        this.inicio = 0;
        this.fim = fim;
    }

    public void busca_binaria_iterativa(int valor) {
        int meio;
        while (this.inicio < this.fim) {
            meio = (this.inicio + this.fim) / 2;
            if (valor == meio) {
                System.out.println("Valor encontrado na posição " + meio);
                return;
            } else if (valor < meio) {
                this.fim = meio - 1;
            } else {
                this.inicio = meio + 1;
            }
        }
        System.out.println("Valor não encontrado!");
    }

    public void busca_binaria_recursiva(int valor, int fim, int inicio) {
        int meio = (inicio + fim) / 2;
        if (inicio > fim) {
            System.out.println("Valor não encontrado!");
            return;
        }
        if (valor == meio) {
            System.out.println("Valor encontrado na posição " + meio);
            return;
        } else if (valor < meio) {
            busca_binaria_recursiva(valor, meio - 1, inicio);
        } else {
            busca_binaria_recursiva(valor, fim, meio + 1);
        }

    }
}
