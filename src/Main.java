import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteDatabase database = new ClienteDatabase();

        database.addCliente(new Cliente("Hilderaldo Luís Bellini", "09871349701", "85 99701-4497", "hlbellini@xyz.com"));
        database.addCliente(new Cliente("Mauro Ramos de Oliveira", "59677182508", "85 99701-5544", "maurorol@gmail.com"));

        PesquisarExibir pesquisaCliente = new PesquisarExibir(database);

        // Input de usuário para pesquisar CPF
        Scanner pes = new Scanner(System.in);
        System.out.println("Pesquisar CPF: ");
        String cpf = pes.nextLine();

        // Pesquisa
        pesquisaCliente.pesquisarExibir(cpf);
    }
}