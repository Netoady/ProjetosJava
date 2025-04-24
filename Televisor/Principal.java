public class Principal {
    public static void main(String[] args) {
        Televisor mTV = new Televisor(5,15,true);
        ControleRemoto controle = new ControleRemoto(mTV);

        controle.ligar();
        controle.trocarCanal(5);
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.mostrarStatus();

        controle.desligar();
        controle.mostrarStatus();


    }
}
