public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor (int canal, int volume, boolean ligado) {
        this.canal = 5;
        this.volume = 50;
        this.ligado = true;
    }

    public void ligar () {
        ligado = true;
        System.out.println("Tv ligada.");
    }

    public void desligar () {
        ligado = false;
        System.out.println("Tv desligada.");
    }

    public void aumentarVolume () {
        if (ligado && volume < 100) {
            volume ++;
        }
    }

    public void diminuirVolume () {
        if (ligado && volume > 0) {
            volume --;
        }
    }

    public void trocarCanal (int novoCanal) {
        if (ligado && novoCanal > 0) {
            canal = novoCanal;
        }
    }

    public String toString() {
        return ligado ?
        "TV ligada | Canal: "+ canal + "Volume: "+ volume: "TV desligada";
    }
}