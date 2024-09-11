import java.util.Scanner;

public class Caminhonete extends Veiculo {

    public Caminhonete(double peso) {
        super("Caminhonete", peso);
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
