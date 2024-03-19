// Essa classe tem a função de
// pesquisar e exibir clientes de acordo com seu CPF.

public class PesquisarExibir {
    private ClienteDatabase pesquisa;

    public PesquisarExibir(ClienteDatabase pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void pesquisarExibir(String Cpf) {
        Cliente clientePesquisa = pesquisa.pesquisarClientePorCpf(Cpf);
        if(clientePesquisa != null) {
            exibirDados(clientePesquisa);
        } else {
            System.out.println("CPF " + Cpf + " não encontrado.");
        }
    }

    private void exibirDados(Cliente cliente) {
        System.out.println("Cliente encontrado:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Celular: " + cliente.getCelular());
        System.out.println("Email: " + cliente.getEmail());
    }
}
