
public class ListaClientes {
    private Clientes inicio;
    private Clientes fim;
    ListaLocacoes lis = new ListaLocacoes();

    public void setup(ListaLocacoes listaLocacoes) {
        lis = listaLocacoes;
    }

    public ListaClientes() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public void adicionar(Clientes cliente) {
        if (estahVazia()) {
            inicio = cliente;
            fim = cliente;
        } else {
            cliente.setAnterior(fim);
            fim.setProximo(cliente);
            fim = cliente;

        }

    }

    public Clientes buscar(String cpf) {
        if (estahVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            Clientes cliente = inicio;
            while (cliente != null && !cliente.getCpf().equals(cpf)) {
                cliente = cliente.getProximo();
            }
            if (cliente == null) {
                System.out.println("Cliente não encontrado");
                return null;
            } else {
                return cliente;
            }
        }
    }

    public boolean remover(String cpf) {
        Clientes cliente = buscar(cpf);
        Locacoes locado = lis.buscarCnh(cliente.getCnh());
        if (cliente.getCnh() == locado.getCnhCliente()) {
            System.out.println("Cliente não pode ser removido, pois está com um veículo locado");
            return false;
        } else if (cliente != null) {
            cliente.getAnterior().setProximo(cliente.getProximo());
            cliente.getProximo().setAnterior(cliente.getAnterior());
        }
        return true;
    }

    public void editar(String cpf, String nome, String cnh, String telefone) {
        Clientes cliente = buscar(cpf);
        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setCnh(cnh);
            cliente.setTelefone(telefone);
        }
    }

    public void listar() {
        if (estahVazia()) {
            System.out.println("Lista vazia");
        } else {
            Clientes cliente = inicio;
            while (cliente != null) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("CNH: " + cliente.getCnh());
                System.out.println("Telefone: " + cliente.getTelefone());
                cliente = cliente.getProximo();
            }
        }
    }
}
