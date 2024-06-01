public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adicionaItem(1);
        vetor.adicionaItem(2);
        vetor.adicionaItem(3);
        vetor.adicionaItem(4);
        vetor.adicionaItem(5);
        vetor.adicionaItem(25);
        vetor.adicionaItem(7);
        vetor.adicionaItem(8);
        vetor.adicionaItem(9);
        vetor.adicionaItem(10);
        vetor.adicionaItem(35);
        System.out.println("Maior valor do vetor: " + vetor.maiorRecursivo());
        System.out.println("Maior valor do vetor: " + vetor.maiorIterativo());
    }

}
