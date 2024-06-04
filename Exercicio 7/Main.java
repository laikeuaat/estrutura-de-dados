public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        for (int i = 0; i < 1000; i++) {
            vetor.inserir(i);
        }
        PesquisaBinaria iterativa = new PesquisaBinaria(vetor.getTamanho() - 1);
        iterativa.busca_binaria_iterativa(500);
        PesquisaBinaria recursiva = new PesquisaBinaria(vetor.getTamanho() - 1);
        recursiva.busca_binaria_recursiva(500, 999, 0);
    }
}
