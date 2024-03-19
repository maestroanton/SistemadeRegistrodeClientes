// Essa classe tem a função de adicionar novos clientes,
// assim como criar o HashMap.

import java.util.HashMap;
public class ClienteDatabase {
    private HashMap<String, Cliente> mapaCliente;
    private Serializador serializador;

    public ClienteDatabase() {
        serializador = new Serializador();
        mapaCliente = serializador.carregarClienteEmArquivo();
        if(mapaCliente == null) {
            mapaCliente = new HashMap<>();
        }
    }

    public void addCliente(Cliente cliente) {
        mapaCliente.put(cliente.getCpf(), cliente);
        serializador.salvarClienteEmArquivo(mapaCliente);
    }

    public Cliente pesquisarClientePorCpf(String Cpf) {
        return mapaCliente.get(Cpf);
    }

    public HashMap<String, Cliente> getMapaCliente() {
        return mapaCliente;
    }

}