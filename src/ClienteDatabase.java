import java.util.HashMap;
public class ClienteDatabase {
    private HashMap<String, Cliente> mapaCliente;

    public ClienteDatabase() {
        mapaCliente = new HashMap<>();
    }

    public void addCliente(Cliente cliente) {
        mapaCliente.put(cliente.getCpf(), cliente);
    }

    public Cliente pesquisarClientePorCpf(String Cpf) {
        return mapaCliente.get(Cpf);
    }
}