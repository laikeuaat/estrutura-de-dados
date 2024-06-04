
public class Locacoes {
    String cnhCliente;
    String placaVeiculo;
    int dataRetirada;
    int dataDevolucao;
    double valorDevido;
    Locacoes proximo;
    Locacoes anterior;
    ListaVeiculos veiculos;

    public Locacoes(String cnhCliente, String placaVeiculo, int dataRetirada, int dataDevolucao) {
        this.cnhCliente = cnhCliente;
        this.placaVeiculo = placaVeiculo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorDevido = calcularValorDevido();
        this.proximo = null;
        this.anterior = null;
    }

    public double calcularValorDevido() {
        double valor = (veiculos.buscar(placaVeiculo).getCategoria().getIdentificador() / 10)
                * (dataDevolucao - dataRetirada);
        return valor;
    }

    public String getCnhCliente() {
        return cnhCliente;
    }

    public void setCnhCliente(String cnhCliente) {
        this.cnhCliente = cnhCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public int getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(int dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(double valorDevido) {
        this.valorDevido = valorDevido;
    }

    public Locacoes getProximo() {
        return proximo;
    }

    public void setProximo(Locacoes proximo) {
        this.proximo = proximo;
    }

    public Locacoes getAnterior() {
        return anterior;
    }

    public void setAnterior(Locacoes anterior) {
        this.anterior = anterior;
    }

}
