public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;
    private Proprietario proprietario; // Associação Bidirecional

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Métodos que Retornam Objetos de Outras Classes
    public Motor getMotor() {
        return motor;
    }

    // Métodos que Retornam Objetos de Outras Classes
    public void substituirMotor(Motor novoMotor) {
        this.motor = novoMotor;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        if (motor != null) {
            motor.exibirMotor();
        }
        if (proprietario != null) {
            System.out.println("Proprietário: " + proprietario.getNome());
        }
    }

    public String compararAno(Carro outroCarro) {
        if (this.ano > outroCarro.getAno()) {
            return "Este carro é mais novo.";
        } else if (this.ano < outroCarro.getAno()) {
            return "O outro carro é mais novo.";
        } else {
            return "Os dois carros têm o mesmo ano.";
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
