public class Principal {
    public static void main(String[] args) {

        FitaVideo fita1 = new FitaVideo("Matrix", 3.50);
        FitaVideo fita2 = new FitaVideo("O Senhor dos Anéis", 4.00);
        FitaVideo fita3 = new FitaVideo("Harry Potter", 3.00);

        System.out.println(fita1.toString());
        System.out.println("Valor do aluguel por 5 dias: R$ " + fita1.getValorAluguel(5));
        System.out.println();

        System.out.println(fita2.toString());
        System.out.println("Valor do aluguel por 3 dias: R$ " + fita2.getValorAluguel(3));
        System.out.println();

        System.out.println(fita3.toString());
        System.out.println("Valor do aluguel por 7 dias: R$ " + fita3.getValorAluguel(7));
        System.out.println();
    }
}