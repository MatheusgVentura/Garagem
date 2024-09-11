public class Motocicleta extends Veiculo {

    public Motocicleta(double peso) {
        super("Motocicleta", peso);
    }

    @Override
    public double calcularPrecoPorHora() {
        if (getPeso() <= 100) {
            return 2.00;
        } else if (getPeso() <= 299.9) {
            return 4.00;
        } else {
            return 10.00;
        }
    }
}