
public class ListaCategorias {
    private Categorias inicio;
    private Categorias fim;

    public ListaCategorias() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public void adicionar(Categorias categoria) {
        if (estahVazia()) {
            inicio = categoria;
            fim = categoria;
        } else {
            categoria.setAnterior(fim);
            fim.setProximo(categoria);
            fim = categoria;

        }

    }

    public Categorias buscar(int identificador) {
        if (estahVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            Categorias categoria = inicio;
            while (categoria != null && categoria.getIdentificador() != identificador) {
                categoria = categoria.getProximo();
            }
            if (categoria == null) {
                System.out.println("Categoria não encontrada");
                return null;
            } else {
                return categoria;
            }
        }
    }

    public boolean remover(int identificador) {
        Categorias categoria = buscar(identificador);
        if (categoria != null) {
            categoria.getAnterior().setProximo(categoria.getProximo());
            categoria.getProximo().setAnterior(categoria.getAnterior());
            return true;
        }
        return false;

    }

    public void editar(int identificador, String nome) {
        Categorias categoria = buscar(identificador);
        if (categoria != null) {
            categoria.setNome(nome);
        }
    }

    public void listar() {
        if (estahVazia()) {
            System.out.println("Lista vazia");
        } else {
            Categorias categoria = inicio;
            while (categoria != null) {
                System.out.println("Nome: " + categoria.getNome() + " Identificador: " + categoria.getIdentificador());
                categoria = categoria.getProximo();
            }
        }
    }

}
