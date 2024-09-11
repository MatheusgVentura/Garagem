public abstract class Veiculo {
    private String tipo;
    private double peso;

    public Veiculo(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double calcularPrecoPorHora();
}
