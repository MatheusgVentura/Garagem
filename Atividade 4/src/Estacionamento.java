import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("Deseja registrar um novo veículo? (sim/não)");
            opcao = scanner.nextLine().toLowerCase();

            if (opcao.equals("sim")) {
                System.out.println("Informe o tipo de veículo (motocicleta/carro/furgão/caminhonete): ");
                String tipo = scanner.nextLine().toLowerCase();

                System.out.println("Informe o peso do veículo em toneladas (ex: 1,5): ");
                double peso = scanner.nextDouble();
                scanner.nextLine();

                // Utilizando a classe ClassificadorDeVeiculos

                // O que esta classe faz : Este método recebe como parâmetros o tipo e o peso do veículo.
                // Ele então utiliza uma lógica de decisão (switch) para determinar qual subclasse de Veiculo deve ser instanciada, com base nas regras fornecidas.

                // Exemplo : Para carros de passeio que ultrapassam 2 toneladas, a classe os classifica como furgões automaticamente.
                Veiculo veiculo = ClassificadorDeVeiculos.classificarVeiculo(tipo, peso);

                if (veiculo == null) {
                    System.out.println("Não foi possível classificar o veículo.");
                    continue;
                }

                double preco = veiculo.calcularPrecoPorHora();

                if (preco == -1) {
                    System.out.println("Este veículo não é aceito no estacionamento.");
                } else {
                    System.out.printf("O preço por hora para o veículo do tipo %s é: R$ %.2f%n", veiculo.getTipo(), preco);
                }
            }

        } while (!opcao.equals("não"));

        scanner.close();
        System.out.println("Encerrando o sistema de estacionamento.");
    }
}
