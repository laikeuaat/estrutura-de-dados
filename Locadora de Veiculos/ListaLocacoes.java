
public class ListaLocacoes {
    private Locacoes inicio;
    private Locacoes fim;

    public ListaLocacoes() {
        this.inicio = null;
        this.fim = null;
    }

    public void locarVeiculo(Locacoes locacao) {
        if (estahVazia()) {
            inicio = locacao;
            fim = locacao;
        } else {
            locacao.setAnterior(fim);
            fim.setProximo(locacao);
            fim = locacao;
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public Locacoes buscar(String placaVeiculo) {
        if (estahVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            Locacoes locacao = inicio;
            while (locacao != null && !locacao.getPlacaVeiculo().equals(placaVeiculo)) {
                locacao = locacao.getProximo();
            }
            if (locacao == null) {
                System.out.println("Locação não encontrada");
                return null;
            } else {
                return locacao;
            }
        }
    }

    public Locacoes buscarCnh(String cnhCliente) {
        if (estahVazia()) {
            System.out.println("Lista vazia");
            return null;
        } else {
            Locacoes locacao = inicio;
            while (locacao != null && !locacao.getCnhCliente().equals(cnhCliente)) {
                locacao = locacao.getProximo();
            }
            if (locacao == null) {
                System.out.println("Locação não encontrada");
                return null;
            } else {
                return locacao;
            }
        }
    }

    public boolean devolverVeiculo(String placaVeiculo) {
        Locacoes locacao = buscar(placaVeiculo);
        if (locacao != null) {
            locacao.getAnterior().setProximo(locacao.getProximo());
            locacao.getProximo().setAnterior(locacao.getAnterior());
            return true;
        }
        return false;
    }

    public void listar() {
        if (estahVazia()) {
            System.out.println("Lista vazia");
        } else {
            Locacoes locacao = inicio;
            while (locacao != null) {
                System.out.println("CNH do cliente: " + locacao.getCnhCliente());
                System.out.println("Placa do veículo: " + locacao.getPlacaVeiculo());
                System.out.println("Data de retirada: " + locacao.getDataRetirada());
                System.out.println("Data de devolução: " + locacao.getDataDevolucao());
                System.out.println("Valor devido: " + locacao.getValorDevido());
                locacao = locacao.getProximo();
            }
        }
    }

    public void listarDisponiveis() {

    }
}
