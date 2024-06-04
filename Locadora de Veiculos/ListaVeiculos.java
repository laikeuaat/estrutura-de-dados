
public class ListaVeiculos {
    private Veiculos inicio;
    private Veiculos fim;

    public ListaVeiculos() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public void adicionar(Veiculos veiculo) {
        if (estahVazia()) {
            inicio = veiculo;
            fim = veiculo;
        } else {
            veiculo.setAnterior(fim);
            fim.setProximo(veiculo);
            fim = veiculo;

        }

    }

    public Veiculos buscar(String placa) {
        if (estahVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            Veiculos veiculo = inicio;
            while (veiculo != null && !veiculo.getPlaca().equals(placa)) {
                veiculo = veiculo.getProximo();
            }
            if (veiculo == null) {
                System.out.println("Veiculo não encontrado");
                return null;
            } else {
                return veiculo;
            }
        }
    }

    public boolean remover(String placa) {
        Veiculos veiculo = buscar(placa);
        if (veiculo != null) {
            veiculo.getAnterior().setProximo(veiculo.getProximo());
            veiculo.getProximo().setAnterior(veiculo.getAnterior());
            return true;
        }
        return false;

    }

    public void listar() {
        if (estahVazia()) {
            System.out.println("Lista vazia");
        } else {
            Veiculos veiculo = inicio;
            while (veiculo != null) {
                System.out.println("Placa: " + veiculo.getPlaca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Ano: " + veiculo.getAno());
                System.out.println("Potencia: " + veiculo.getPotencia());
                System.out.println("Numero de lugares: " + veiculo.getNumeroLugares());
                veiculo = veiculo.getProximo();
            }
        }
    }

    public void editar(String placa, String modelo, String marca, String ano, String potencia,
            int numeroLugares) {
        Veiculos veiculo = buscar(placa);
        if (veiculo != null) {
            veiculo.setModelo(modelo);
            veiculo.setMarca(marca);
            veiculo.setAno(ano);
            veiculo.setPotencia(potencia);
            veiculo.setNumeroLugares(numeroLugares);
        }
    }

}
