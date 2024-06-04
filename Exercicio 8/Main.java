import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vetor vetor = new Vetor(10);
        for (int i = 0; i < vetor.capacidade(); i++) {
            vetor.inserir(random.nextInt(10));
        }
        System.out.println("Vetor desordenado:");
        vetor.exibir();
        System.out.println("Vetor ordenado:");
        Ordenacao.bubbleSort(vetor).exibir();
        Vetor vetor2 = new Vetor(10);
        for (int i = 0; i < vetor2.capacidade(); i++) {
            vetor2.inserir(random.nextInt(10));
        }
        System.out.println("Vetor desordenado:");
        vetor2.exibir();
        System.out.println("Vetor ordenado:");
        Ordenacao.selectionSort(vetor2).exibir();
        Vetor vetor3 = new Vetor(10);
        System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor3.capacidade(); i++) {
            vetor3.inserir(random.nextInt(10));
        }
        vetor3.exibir();
        System.out.println("Vetor ordenado:");
        Ordenacao.insertionSort(vetor3).exibir();

    }
}
