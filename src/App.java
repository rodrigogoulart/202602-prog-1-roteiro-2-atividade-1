public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Exercício 1: Crie uma classe Proprietario com os
         * atributos nome (String) e carro (Carro). Adicione
         * um método exibirProprietarioECarro que imprime o
         * nome do proprietário e os detalhes do carro.
         */

        Carro carro1 = new Carro("Volkswagen", "Gol", 2015);
        Proprietario proprietario1 = new Proprietario("Rodrigo", carro1);

        proprietario1.exibirProprietarioECarro();

        /*
         * Exercício 2: Na classe Carro, adicione um método 
         * compararAno que recebe outro objeto Carro como 
         * parâmetro e retorna qual dos dois carros é mais novo.
         */

        Carro carro2 = new Carro("Ford", "Mustang", 2020);
        carro2.compararAno(carro1); // Retorna uma String mas não a imprime
        System.out.println(carro2.compararAno(carro1));

        /*
         * Exercício 3: Crie uma classe Endereco com os 
         * atributos rua (String), numero (int) e cidade 
         * (String). Adicione um atributo endereco na classe 
         * Proprietario e um método exibirEndereco que imprime 
         * os detalhes do endereço.
         */

         Endereco endereco1 = new Endereco("Ipiranga", 2000, "Novo Hamburgo");
         proprietario1.setEndereco(endereco1);
         endereco1.exibirEndereco();

        /*
         * Exercício 4: Crie uma classe Motor com os atributos 
         * potencia (int) e tipo (String). Adicione um atributo 
         * motor na classe Carro e um método exibirMotor que 
         * imprime os detalhes do motor.
         */

        Motor motor1 = new Motor(2000, "aspirado");
        carro1.setMotor(motor1);
        motor1.exibirMotor();

        /*
         * Exercício 5: Modifique a classe Carro para incluir um 
         * atributo proprietario (Proprietario). Adicione métodos 
         * get e set para esse atributo e ajuste os métodos 
         * exibirDetalhes e exibirProprietarioECarro para 
         * refletir essa associação.
         */

        System.out.println("\ncarro1.setProprietario(proprietario1); -> carro1.exibirDetalhes();");
         carro1.setProprietario(proprietario1);
         carro1.exibirDetalhes();
         System.out.println("\ncarro2.exibirDetalhes();");
         carro2.exibirDetalhes();
         System.out.println("\nproprietario1.exibirProprietarioECarro();");
         proprietario1.exibirProprietarioECarro();

         /*
          * Exercício 6: Na classe Proprietario, adicione um 
          método trocarCarro que recebe um objeto Carro como 
          parâmetro e atualiza o atributo carro.
          */
          System.out.println("\nproprietario1.trocarCarro(carro2); -> proprietario1.exibirProprietarioECarro();");
          proprietario1.trocarCarro(carro2);
          proprietario1.exibirProprietarioECarro();

        /*
         * Exercício 7: Na classe Carro, adicione um método 
         * getMotor que retorna o objeto Motor associado ao carro.
         */

        System.out.println("\nMotor tempMotor = carro1.getMotor(); -> tempMotor.exibirMotor();");
        Motor tempMotor = carro1.getMotor();
        tempMotor.exibirMotor();

        /*
         * Exercício 8: Na classe Endereco, adicione um 
         * método atualizarEndereco que recebe os parâmetros 
         * rua, numero e cidade e atualiza os atributos 
         * correspondentes.
         * Na classe Proprietario, adicione um método 
         * mudarEndereco que recebe um objeto Endereco 
         * como parâmetro e atualiza o atributo endereco.
         */

        System.out.println("\nendereco1.atualizarEndereco(\"Bento Gonçalves\", 1000, \"Porto Alegre\"); -> proprietario1.exibirProprietarioECarro();");
         endereco1.atualizarEndereco("Bento Gonçalves", 1000, "Porto Alegre");
         proprietario1.exibirProprietarioECarro();

         System.out.println("\nproprietario1.mudarEndereco(new Endereco(\"Rua A\", 123, \"NH\")d); -> proprietario1.exibirProprietarioECarro();");
         proprietario1.mudarEndereco(new Endereco("Rua A", 123, "NH"));
         proprietario1.exibirProprietarioECarro();

         /*
          * Exercício 9: Na classe Carro, adicione um método 
          substituirMotor que recebe um objeto Motor como 
          parâmetro e atualiza o atributo motor.
          */

        Motor motor2 = new Motor(1300, "turbo");
        System.out.println("\ncarro2.setMotor(motor2); -> carro2.exibirDetalhes();");
        carro2.setMotor(motor2);
        carro2.exibirDetalhes();
    }
}
