package Locadora de Veiculos;

public class ListaClientes {
    Clientes inicio;
    Clientes fim;
    public ListaClientes() {
        this.inicio = null;
        this.fim = null;
    }
    public boolean estahVazia() {
        return inicio == null;
    }
    public void adicionarCliente(Clientes cliente) {
        if (estahVazia()) {
            inicio = cliente;
            fim = cliente;
        } else {
            cliente.setAnterior(fim);
            fim.setProximo(cliente);
            fim = cliente;

        }
        
    }
    public Cliente buscarCliente(String cpf) {
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
    public boolean estahVazia() {
        return inicio == null;
    }
    public boolean removerCliente(String cpf) {
        cliente = buscarCliente(cpf);
        if(cliente != null){
            cliente.getAnterior().setProximo(cliente.getProximo());
            cliente.getProximo().setAnterior(client.getAnterior());
            return true;
        }
        return false;

    }
    public void editarCliente(String cpf, String nome, String cnh, String telefone) {
        cliente = buscarCliente(cpf);
        if(cliente != null){
            cliente.setNome(nome);
            cliente.setCnh(cnh);
            cliente.setTelefone(telefone);
        }
    }
    public void listarClientes() {
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
