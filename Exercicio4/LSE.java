public class LSE implements Lista {
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Aluno aluno) {
        Noh novo = new Noh(aluno);
        novo.setProximo(this.inicio);
        this.inicio = novo;
    }

    public void insereFim(Aluno aluno) {
        Noh novo = new Noh(aluno);
        if (this.inicio == null) {
            this.inicio = novo;
        } else {
            Noh aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public boolean estaVazia() {
        return this.inicio == null;
    }

    public boolean remove(int indice) {
        if (indice < 0 || indice >= this.tamanho()) {
            return false;
        }
        if (indice == 0) {
            this.inicio = this.inicio.getProximo();
            return true;
        }
        Noh aux = this.inicio;
        for (int i = 0; i < indice - 1; i++) {
            aux = aux.getProximo();
        }
        aux.setProximo(aux.getProximo().getProximo());
        return true;
    }

    public int tamanho() {
        int contador = 0;
        Noh aux = this.inicio;
        while (aux != null) {
            contador++;
            aux = aux.getProximo();
        }
        return contador;
    }

    public void imprimir() {
        Noh aux = this.inicio;
        while (aux != null) {
            System.out.println("Aluno:" + aux.getAluno().getNome() + " - " + aux.getAluno().getIdade() + " - "
                    + aux.getAluno().getMatricula() + " - " + aux.getAluno().getCurso());
            aux = aux.getProximo();
        }
    }
}