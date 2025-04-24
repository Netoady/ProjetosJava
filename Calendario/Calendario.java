public class Calendario {
    int dia;
    int mes;
    int ano;

    // Construtor
    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Retorna o nome do mês correspondente
    public String nomeMes(int m) {
        switch (m) {
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            default: return "mês inválido";
        }
    }

    // Mostra a data no formato: "dia de nome do mês de ano"
    public void mostrarData() {
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }

    // Verifica se o ano é bissexto
    public void anoBissexto() {
        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
