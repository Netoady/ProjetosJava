public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimir() {
        System.out.println("Lado do quadrado: " + lado);
        System.out.println("Área do quadrado: " + calcularArea());
        System.out.println("Perímetro do quadrado: " + calcularPerimetro());
    }
}
