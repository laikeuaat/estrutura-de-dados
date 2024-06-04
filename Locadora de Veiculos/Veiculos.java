
public class Veiculos {
    private String placa;
    private String modelo;
    private String marca;
    private String ano;
    private String potencia;
    private int numeroLugares;
    private Categorias categoria;
    private Veiculos proximo;
    private Veiculos anterior;

    public Veiculos(String placa, String modelo, String marca, String ano, String potencia, int numeroLugares,
            Categorias categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.numeroLugares = numeroLugares;
        this.categoria = categoria;
        this.proximo = null;
        this.anterior = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Veiculos getProximo() {
        return proximo;
    }

    public Veiculos getAnterior() {
        return anterior;
    }

    public void setProximo(Veiculos proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(Veiculos anterior) {
        this.anterior = anterior;
    }
}
