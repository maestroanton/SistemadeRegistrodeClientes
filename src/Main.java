import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteDatabase database = new ClienteDatabase();

        database.addCliente(new Cliente("Hilderaldo Luís Bellini", "09871349701", "85 99701-4497", "hlbellini@xyz.com"));
        database.addCliente(new Cliente("Mauro Ramos de Oliveira", "59677182508", "85 99701-5544", "maurorol@gmail.com"));

        PesquisarExibir pesquisaCliente = new PesquisarExibir(database);

        Scanner add = new Scanner(System.in);

        // Adicionar novos Clientes em toda
        // nova execução não é necessário,
        // visto que esses já são armazenados
        // em um arquivo de acordo com execuções
        // anteriores.
        System.out.println("Esse sistema armazena clientes previamente cadastrados.");
        while (true) {
            // Capturar informação,
            // adicionar informação em um vetor,
            // separar informação em variáveis,
            // adicionar cliente através das variáveis.
            System.out.println("Insira informações separadas por vírgula na ordem (nome, CPF, celular, e-mail). Digite 'sair' para sair ou 'pesquisa' para pesquisar.");
            String info = add.nextLine();

            if (info.equalsIgnoreCase("sair")) {
                break;
            }

            if (info.equalsIgnoreCase("pesquisa")) {
                // Input de usuário para pesquisar CPF
                Scanner pes = new Scanner(System.in);
                System.out.println("Pesquisar CPF: ");
                String cpf = pes.nextLine();
                pes.close();

                // Pesquisa
                pesquisaCliente.pesquisarExibir(cpf);
                break;
            }

            String[] vetor = info.split(",");
            if (vetor.length != 4) {
                System.out.println("Formato inválido.");
                continue;
            }

            try {
                String nome = vetor[0].trim();
                String cpf = vetor[1].trim();
                String celular = vetor[2].trim();
                String email = vetor[3].trim();

                database.addCliente(new Cliente(nome, cpf, celular, email));
                System.out.println("Cliente adicionado.");
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido.");
            }
        }

    }
}