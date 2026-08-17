public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Métodos que Utilizam Objetos de Outras Classes
    void atualizarEndereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    void exibirEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Cidade: " + cidade);
    }
}
