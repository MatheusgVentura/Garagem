// Utilizando a classe ClassificadorDeVeiculos

// O que esta classe faz : Este método recebe como parâmetros o tipo e o peso do veículo.
// Ele então utiliza uma lógica de decisão (switch) para determinar qual subclasse de Veiculo deve ser instanciada, com base nas regras fornecidas.

// Exemplo : Para carros de passeio que ultrapassam 2 toneladas, a classe os classifica como furgões automaticamente.

public class ClassificadorDeVeiculos {

    public static Veiculo classificarVeiculo(String tipo, double peso) {
        Veiculo veiculo = null;

        switch (tipo.toLowerCase()) {
            case "motocicleta":
                veiculo = new Motocicleta(peso);
                break;
            case "carro":
                if (peso > 2) {
                    veiculo = new Furgao(peso);
                } else {
                    veiculo = new CarroPasseio(peso);
                }
                break;
            case "caminhonete":
                veiculo = new Caminhonete(peso);
                break;
            case "furgão":
                veiculo = new Furgao(peso);
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                break;
        }

        return veiculo;
    }
}
