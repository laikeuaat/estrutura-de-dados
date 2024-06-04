public class Main {
    public static void main(String[] args) {
        Lista lista = new LSE();
        Aluno a1 = new Aluno("João", 20, "2210144251", "CC");
        Aluno a2 = new Aluno("Maria", 21, "2210144252", "EC");
        Aluno a3 = new Aluno("José", 22, "2210144253", "SI");
        Aluno a4 = new Aluno("Ana", 23, "2210144254", "ES");
        Aluno a5 = new Aluno("Carlos", 24, "2210144255", "CC");
        Aluno a6 = new Aluno("Mariana", 25, "2210144256", "EC");
        Aluno a7 = new Aluno("Joaquim", 26, "2210144257", "SI");
        Aluno a8 = new Aluno("Antônia", 27, "2210144258", "ES");
        Aluno a9 = new Aluno("Pedro", 28, "2210144259", "CC");
        Aluno a10 = new Aluno("Joaquina", 29, "2210144260", "EC");
        lista.insereInicio(a1);
        lista.insereInicio(a2);
        lista.insereInicio(a3);
        lista.insereInicio(a4);
        lista.insereInicio(a5);
        lista.insereInicio(a6);
        lista.insereInicio(a7);
        lista.insereInicio(a8);
        lista.insereFim(a9);
        lista.insereFim(a10);
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        lista.remove(0);
        lista.remove(3);
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}
