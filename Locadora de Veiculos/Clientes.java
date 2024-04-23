package Locadora de Veiculos;

public class Clientes {
    private String nome;
    private String cpf;
    private String cnh;
    private String telefone;
    private Clientes proximo;
    private Clientes anterior;

    public Clientes(String nome, String cpf, String cnh, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telefone = telefone;
        this.proximo = null;
        this.anterior = null;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Clientes getProximo() {
        return proximo;
    }
    public Clientes getAnterior() {
        return anterior;
    }
    public void setProximo(Clientes proximo) {
        this.proximo = proximo;
    }
    public void setAnterior(Clientes anterior) {
        this.anterior = anterior;
    }
}
