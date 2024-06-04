package Exercicio 4;

public class LDE implements Lista {
    private Alunos inicio;
    private Alunos fim;
    public LDE() {
        this.inicio = null;
        this.fim = null;
    }
    public void insereInicio(Alunos aluno) {
        if (estahVazoa()) {
            inicio = aluno;
            fim = aluno;
        } else {
            aluno.setProximo(inicio);
            inicio = aluno;
        }
    }
    public void insereFim(Alunos aluno) {
        if (estahVazoa()) {
            inicio = aluno;
            fim = aluno;
        } else {
            fim.setProximo(aluno);
            fim = aluno;
        }
    }
    public boolean estahVazoa() {
        return inicio == null;
    }
    public void remover(Alunos aluno) {
        if (estahVazoa()) {
            System.out.println("Lista vazia");
        } else {
            Alunos aux = inicio;
            Alunos ant = null;
            while (aux != null && aux != aluno) {
                ant = aux;
                aux = aux.getProximo();
            }
            if (aux == null) {
                System.out.println("Aluno não encontrado");
            } else {
                if (aux == inicio) {
                    inicio = inicio.getProximo();
                } else {
                    ant.setProximo(aux.getProximo());
                }
                if (aux == fim) {
                    fim = ant;
                }
            }
        }
    }
    public int tamanho() {
        int cont = 0;
        Alunos aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }
        return cont;
    }

}
