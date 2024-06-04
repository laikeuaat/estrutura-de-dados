
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaClientes listaClientes = new ListaClientes();
        ListaVeiculos listaVeiculos = new ListaVeiculos();
        ListaCategorias listaCategorias = new ListaCategorias();
        ListaLocacoes listaLocacoes = new ListaLocacoes();

        boolean saida = false;
        do {
            System.out.println("Bem vindo ao sistema de locação de veiculos!");
            System.out.println("Digite o que deseja fazer:");
            System.out.println("1 - Caso seu problema seja com clientes");
            System.out.println("2 - Caso seu problema seja com veiculos");
            System.out.println("3 - Caso seu problema seja com categorias");
            System.out.println("4 - Caso seu problema seja com locações");
            System.out.println("5 - Sair");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("1 - Adicionar cliente");
                    System.out.println("2 - Buscar cliente");
                    System.out.println("3 - Listar cliente");
                    System.out.println("4 - Editar cliente");
                    System.out.println("5 - Remover cliente");
                    int opcaoCliente = entrada.nextInt();
                    switch (opcaoCliente) {
                        case 1:
                            System.out.println("Digite o nome do cliente");
                            String nome = entrada.next();
                            System.out.println("Digite o cpf do cliente");
                            String cpf = entrada.next();
                            System.out.println("Digite a cnh do cliente");
                            String cnh = entrada.next();
                            System.out.println("Digite o telefone do cliente");
                            String telefone = entrada.next();
                            Clientes cliente = new Clientes(nome, cpf, cnh, telefone);
                            listaClientes.adicionar(cliente);
                            break;
                        case 2:
                            System.out.println("Digite o cpf do cliente");
                            String cpfBusca = entrada.next();
                            Clientes clienteBusca = listaClientes.buscar(cpfBusca);
                            if (clienteBusca != null) {
                                System.out.println("Cliente encontrado");
                                System.out.println("Nome: " + clienteBusca.getNome());
                                System.out.println("Cpf: " + clienteBusca.getCpf());
                                System.out.println("Cnh: " + clienteBusca.getCnh());
                                System.out.println("Telefone: " + clienteBusca.getTelefone());
                            }
                            break;
                        case 3:
                            listaClientes.listar();
                            break;
                        case 4:
                            System.out.println("Digite o cpf do cliente");
                            String cpfEdita = entrada.next();
                            System.out.println("Digite o nome do cliente");
                            String nomeEdita = entrada.next();
                            System.out.println("Digite a cnh do cliente");
                            String cnhEdita = entrada.next();
                            System.out.println("Digite o telefone do cliente");
                            String telefoneEdita = entrada.next();
                            listaClientes.editar(cpfEdita, nomeEdita, cnhEdita, telefoneEdita);
                            break;
                        case 5:
                            listaClientes.setup(listaLocacoes);
                            System.out.println("Digite o cpf do cliente");
                            String cpfRemove = entrada.next();
                            listaClientes.remover(cpfRemove);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - Adicionar veiculo");
                    System.out.println("2 - Buscar veiculo");
                    System.out.println("3 - Listar veiculo");
                    System.out.println("4 - Editar veiculo");
                    System.out.println("5 - Remover veiculo");
                    int opcaoVeiculo = entrada.nextInt();
                    switch (opcaoVeiculo) {
                        case 1:
                            System.out.println("Digite a placa do veiculo");
                            String placa = entrada.next();
                            System.out.println("Digite o modelo do veiculo");
                            String modelo = entrada.next();
                            System.out.println("Digite a marca do veiculo");
                            String marca = entrada.next();
                            System.out.println("Digite o ano do veiculo");
                            String ano = entrada.next();
                            System.out.println("Digite a potencia do veiculo");
                            String potencia = entrada.next();
                            System.out.println("Digite o numero de lugares do veiculo");
                            int numeroLugares = entrada.nextInt();
                            System.out.println("Digite o identificador da categoria");
                            int identificador = entrada.nextInt();
                            Categorias categoria = listaCategorias.buscar(identificador);
                            if (categoria == null) {
                                System.out.println("Digite o nome da categoria");
                                String nome = entrada.next();
                                categoria = new Categorias(nome, identificador);
                            }
                            Veiculos veiculo = new Veiculos(placa, modelo, marca, ano, potencia, numeroLugares,
                                    categoria);
                            listaVeiculos.adicionar(veiculo);
                            break;
                        case 2:
                            System.out.println("Digite a placa do veiculo");
                            String placaBusca = entrada.next();
                            Veiculos veiculoBusca = listaVeiculos.buscar(placaBusca);
                            if (veiculoBusca != null) {
                                System.out.println("Veiculo encontrado");
                                System.out.println("Placa: " + veiculoBusca.getPlaca());
                                System.out.println("Modelo: " + veiculoBusca.getModelo());
                                System.out.println("Marca: " + veiculoBusca.getMarca());
                                System.out.println("Ano: " + veiculoBusca.getAno());
                                System.out.println("Potencia: " + veiculoBusca.getPotencia());
                                System.out.println("Numero de lugares: " + veiculoBusca.getNumeroLugares());
                            }
                            break;
                        case 3:
                            listaVeiculos.listar();
                            break;
                        case 4:
                            System.out.println("Digite a placa do veiculo");
                            String placaEdita = entrada.next();
                            System.out.println("Digite o modelo do veiculo");
                            String modeloEdita = entrada.next();
                            System.out.println("Digite a marca");
                            String marcaEdita = entrada.next();
                            System.out.println("Digite o ano do veiculo");
                            String anoEdita = entrada.next();
                            System.out.println("Digite a potencia do veiculo");
                            String potenciaEdita = entrada.next();
                            System.out.println("Digite o numero de lugares do veiculo");
                            int numeroLugaresEdita = entrada.nextInt();
                            listaVeiculos.editar(placaEdita, modeloEdita, marcaEdita, anoEdita, potenciaEdita,
                                    numeroLugaresEdita);
                            break;
                        case 5:
                            System.out.println("Digite a placa do veiculo");
                            String placaRemove = entrada.next();
                            listaVeiculos.remover(placaRemove);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 - Adicionar categoria");
                    System.out.println("2 - Buscar categoria");
                    System.out.println("3 - Listar categoria");
                    System.out.println("4 - Editar categoria");
                    System.out.println("5 - Remover categoria");
                    int opcaoCategoria = entrada.nextInt();
                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Digite o nome da categoria");
                            String nome = entrada.next();
                            System.out.println("Digite o identificador da categoria");
                            int identificador = entrada.nextInt();
                            Categorias categoria = new Categorias(nome, identificador);
                            listaCategorias.adicionar(categoria);
                            break;
                        case 2:
                            System.out.println("Digite o identificador da categoria");
                            int identificadorBusca = entrada.nextInt();
                            Categorias categoriaBusca = listaCategorias.buscar(identificadorBusca);
                            if (categoriaBusca != null) {
                                System.out.println("Categoria encontrada");
                                System.out.println("Nome: " + categoriaBusca.getNome());
                                System.out.println("Identificador: " + categoriaBusca.getIdentificador());
                            }
                            break;
                        case 3:
                            listaCategorias.listar();
                            break;
                        case 4:
                            System.out.println("Digite o identificador da categoria");
                            int identificadorEdita = entrada.nextInt();
                            System.out.println("Digite o nome da categoria");
                            String nomeEdita = entrada.next();
                            listaCategorias.editar(identificadorEdita, nomeEdita);
                            break;
                        case 5:
                            System.out.println("Digite o identificador da categoria");
                            int identificadorRemove = entrada.nextInt();
                            listaCategorias.remover(identificadorRemove);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1 - Adicionar locação");
                    System.out.println("2 - Buscar locação");
                    System.out.println("3 - Listar locação");
                    System.out.println("4 - Devolver Veiculo");
                    int opcaoLocacao = entrada.nextInt();
                    switch (opcaoLocacao) {
                        case 1:
                            System.out.println("Digite o cpf do cliente");
                            String cpf = entrada.next();
                            Clientes cliente = listaClientes.buscar(cpf);
                            if (cliente == null) {
                                System.out.println("Digite o nome do cliente");
                                String nome = entrada.next();
                                System.out.println("Digite a cnh do cliente");
                                String cnh = entrada.next();
                                System.out.println("Digite o telefone do cliente");
                                String telefone = entrada.next();
                                cliente = new Clientes(nome, cpf, cnh, telefone);
                            }
                            System.out.println("Digite a placa do veiculo");
                            String placa = entrada.next();
                            Veiculos veiculo = listaVeiculos.buscar(placa);
                            if (veiculo == null) {
                                System.out.println("Digite o modelo do veiculo");
                                String modelo = entrada.next();
                                System.out.println("Digite a marca do veiculo");
                                String marca = entrada.next();
                                System.out.println("Digite o ano do veiculo");
                                String ano = entrada.next();
                                System.out.println("Digite a potencia do veiculo");
                                String potencia = entrada.next();
                                System.out.println("Digite o numero de lugares do veiculo");
                                int numeroLugares = entrada.nextInt();
                                System.out.println("Digite o identificador da categoria");
                                int identificador = entrada.nextInt();
                                Categorias categoria = listaCategorias.buscar(identificador);
                                if (categoria == null) {
                                    System.out.println("Digite o nome da categoria");
                                    String nome = entrada.next();
                                    categoria = new Categorias(nome, identificador);
                                }
                                veiculo = new Veiculos(placa, modelo, marca, ano, potencia, numeroLugares, categoria);
                            }
                            System.out.println("Digite a data de inicio");
                            int dataInicio = entrada.nextInt();
                            System.out.println("Digite a data de fim");
                            int dataFim = entrada.nextInt();
                            Locacoes locacao = new Locacoes(cliente.getCnh(), veiculo.getPlaca(), dataInicio, dataFim);
                            listaLocacoes.locarVeiculo(locacao);
                            break;
                        case 2:
                            System.out.println("Digite a placa do veiculo");
                            String placaBusca = entrada.next();
                            Locacoes locacaoBusca = listaLocacoes.buscar(placaBusca);
                            if (locacaoBusca != null) {
                                System.out.println("Locação encontrada");
                                System.out.println("CNH do cliente: " + locacaoBusca.getCnhCliente());
                                System.out.println("Placa do Veiculo: " + locacaoBusca.getPlacaVeiculo());
                                System.out.println("Data de retirada: " + locacaoBusca.getDataRetirada());
                                System.out.println("Data de devolução: " + locacaoBusca.getDataDevolucao());
                                System.out.println("Valor Devido: " + locacaoBusca.getValorDevido());
                            }
                            break;
                        case 3:
                            listaLocacoes.listar();
                            break;
                        case 5:
                            System.out.println("Digite a placa do veiculo");
                            String placaRemove = entrada.next();
                            listaLocacoes.devolverVeiculo(placaRemove);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;

                    }

            }
        } while (!saida);

    }
}
