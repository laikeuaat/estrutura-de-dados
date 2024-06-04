public interface Lista {
    public void insereInicio(Aluno aluno);

    public void insereFim(Aluno aluno);

    public boolean estaVazia();

    public boolean remove(int index);

    public int tamanho();

    public void imprimir();
}
