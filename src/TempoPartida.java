public class TempoPartida {
    int inicio, fim;

    public TempoPartida(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int calcularTempo() {
        if(fim > inicio) {
            return fim - inicio;
        } else {
            int i = (24 - inicio) + fim;
            return Math.min(i, 24);
        }
    }

    public static void main(String[] args) {
        TempoPartida partida = new TempoPartida(14, 14);

        System.out.println("Tempo da partida: " + partida.calcularTempo());
    }
}
