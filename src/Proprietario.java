public class Proprietario {
    private String nome;
    private Carro carro; // Associação Bidirecional
    private Endereco endereco;

    public Proprietario(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public Proprietario(String nome, Carro carro, Endereco endereco) {
        this.nome = nome;
        this.carro = carro;
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Métodos que Utilizam Objetos de Outras Classes
    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }

    // Métodos que Utilizam Objetos de Outras Classes
    public void mudarEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    void exibirProprietarioECarro() {
        System.out.println("Nome do Proprietário: " + nome);
        if (carro != null)
            carro.exibirDetalhes();
        if (endereco != null)
            endereco.exibirEndereco();
    }

    public String getNome() {
        return this.nome;
    }

}
