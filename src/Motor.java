public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    void exibirMotor() {
        System.out.println("Potência: " + potencia + " HP");
        System.out.println("Tipo: " + tipo);
    }
}
