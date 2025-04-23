public class Circulo {
    private double raio;

    private static final double PI = 3.141516;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    public void imprimir() {
        System.out.println("Raio: " + raio);
        System.out.println("Área do círculo: " + calcularArea());
        System.out.println("Perímetro do círculo: " + calcularPerimetro());
    }
}
