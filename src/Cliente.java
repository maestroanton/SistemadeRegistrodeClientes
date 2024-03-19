public class Cliente {
    private static int ultimoId;
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String email;

    public Cliente(String nome, String cpf, String celular, String email) {
        this.id = ++ultimoId; // Automaticamente gerar um ID de identificação único no sistema.
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
}