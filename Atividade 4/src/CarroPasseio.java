public class CarroPasseio extends Veiculo {

    public CarroPasseio(double peso) {
        super("Carro de Passeio", peso);
    }

    @Override
    public double calcularPrecoPorHora() {
        if (getPeso() <= 2) {
            return 15.00; // Sedan Padrão
        } else if (getPeso() <= 3) {
            return 25.00; // Classificado como furgão
        } else if (getPeso() <= 6) {
            return 50.00; // Classificado como caminhonete carregada
        } else {
            return -1;
        }
    }
}
