public class Ordenacao {
    public static Vetor bubbleSort(Vetor vetor) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            for (int j = 0; j < (vetor.tamanho()); j++) {
                if (vetor.buscar(i) < vetor.buscar(j)) {
                    int aux = vetor.buscar(i);
                    vetor.alterar(i, vetor.buscar(j));
                    vetor.alterar(j, aux);
                }
            }
        }
        return vetor;
    }

    public static Vetor selectionSort(Vetor vetor) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.tamanho(); j++) {
                if (vetor.buscar(j) < vetor.buscar(menor)) {
                    menor = j;
                }
            }
            int aux = vetor.buscar(i);
            vetor.alterar(i, vetor.buscar(menor));
            vetor.alterar(menor, aux);
        }
        return vetor;
    }

    public static Vetor insertionSort(Vetor vetor) {
        for (int i = 1; i < vetor.tamanho(); i++) {
            int aux = vetor.buscar(i);
            int j = i - 1;
            while (j >= 0 && vetor.buscar(j) > aux) {
                vetor.alterar(j + 1, vetor.buscar(j));
                j--;
            }
            vetor.alterar(j + 1, aux);
        }
        return vetor;
    }
}