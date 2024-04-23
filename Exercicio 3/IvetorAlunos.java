package InterfaceVetorAlunos;
public interface IvetorAlunos {

    public void adicionar(Alunos aluno);

    public int tamanho();

    public boolean contem(Alunos aluno);

    public boolean cheio();

    public void remover(Alunos aluno);

    public void aumentarCapacidade();
}