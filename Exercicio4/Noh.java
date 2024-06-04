public class Noh {
    private Aluno aluno;
    private Noh proximo;

    public Noh(Aluno aluno) {
        this.aluno = aluno;
        this.proximo = null;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public Noh getProximo() {
        return this.proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
