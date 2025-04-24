public class Principal {
    public static void main(String[] args) {
        // Criando dois objetos Calendario com diferentes datas
        Calendario data1 = new Calendario(12, 1, 1988);
        Calendario data2 = new Calendario(23, 4, 2025);

        // Exibindo dados do primeiro objeto
        System.out.println("Data 1:");
        data1.mostrarData();
        data1.anoBissexto();

        // Exibindo dados do segundo objeto
        System.out.println("\nData 2:");
        data2.mostrarData();
        data2.anoBissexto();
    }
}
