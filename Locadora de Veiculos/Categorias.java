
public class Categorias {
    private String nome;
    private int identificador;
    private Categorias proximo;
    private Categorias anterior;

    public Categorias(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
        this.proximo = null;
        this.anterior = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Categorias getProximo() {
        return proximo;
    }

    public void setProximo(Categorias proximo) {
        this.proximo = proximo;
    }

    public Categorias getAnterior() {
        return anterior;
    }

    public void setAnterior(Categorias anterior) {
        this.anterior = anterior;
    }
}
