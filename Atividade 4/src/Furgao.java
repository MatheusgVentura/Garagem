public class Furgao extends Veiculo {

    public Furgao(double peso) {
        super("Furgão", peso);
    }

    @Override
    public double calcularPrecoPorHora() {
        if (getPeso() <= 3) {
            return 25.00;
        } else if (getPeso() <= 6) {
            return 50.00;
        } else {
            return -1;
        }
    }
}