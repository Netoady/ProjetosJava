public class FitaVideo {

    private String titulo;
    private double precoPorDia;

    public FitaVideo(String titulo, double precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
               "\nPreço por dia: R$ " + precoPorDia;
    }
}