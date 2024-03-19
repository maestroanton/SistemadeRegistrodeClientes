// Essa classe tem como função serializar e desserializar o Hashmap,
// assim como carregá-lo na execução.

import java.io.*;
import java.util.HashMap;

public class Serializador {
    private static final String ARQUIVO = "db_clientes.db";
    public void salvarClienteEmArquivo(HashMap<String, Cliente> mapaCliente) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            stream.writeObject(mapaCliente);
        } catch (IOException a) {
            System.err.println("Erro ao salvar dados: " + a.getMessage());
        }
    }

    public HashMap<String, Cliente> carregarClienteEmArquivo() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (HashMap<String, Cliente>) stream.readObject();
        } catch (IOException | ClassNotFoundException a) {
            // Caso o HashMap não exista, crie outro.
            return new HashMap<>();
        }
    }
}
