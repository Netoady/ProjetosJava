public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea() {
        return comprimento * largura;
    }

    public int calcularPerimetro() {
        return 2 * comprimento + 2 * largura;
    }

    public void imprimir() {
        System.out.printf("Comprimento: %d \n", comprimento);
        System.out.printf("Largura: %d \n", largura);
        System.out.printf("Área do retângulo: %d \n", calcularArea());
        System.out.printf("Perímetro do retângulo: %d \n", calcularPerimetro());
    }
}
