public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
        this.ligado = false;
        this.altitude = 0;
        this.pessoas = 0;
    }

    public boolean isLigado() { 
        return ligado; 
    }
    public int getAltitude() { 
        return altitude; 
    }
    public int getCapacidade() { 
        return capacidade; 
    }
    public int getPessoas() { 
        return pessoas; 
    }

    public void setCapacidade(int capacidade) { 
        this.capacidade = capacidade; 
    }
    public void setPessoas(int pessoas) { 
        this.pessoas = pessoas; 
    }

    public String toString() {
        return "Helicóptero [Ligado: " + ligado +
               ", Altitude: " + altitude +
               ", Capacidade: " + capacidade +
               ", Pessoas a bordo: " + pessoas + "]";
    }

    public void entrar() {
        if (pessoas < capacidade) {
            pessoas++;
        } else {
            System.out.println("TÁ LOTADO!");
        }
    }

    public void sair() {
        if (pessoas > 0) {
            pessoas--;
        } else {
            System.out.println("NÃO TEM NINGUEM");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
        } else {
            System.out.println("Motor ligado.");
        }
    }

    public void decolar(int novaAltitude) {
        if (ligado && altitude == 0) {
            altitude = novaAltitude;
        } else {
            System.out.println("Sem decolar!");
        }
    }

    public void aterrissar() {
        if (ligado && altitude > 0) {
            altitude = 0;
        } else {
            System.out.println("Não dá pra aterrissar. Paciência.");
        }
    }

    public void desligar() {
        if (ligado && altitude == 0) {
            ligado = false;
        } else {
            System.out.println("Impossível desligar. Oremos!");
        }
    }
}
