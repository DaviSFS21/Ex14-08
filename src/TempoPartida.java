public class TempoPartida {
    int inicio, fim;

    public TempoPartida(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int calcularTempo() {
        if(fim > inicio) {
            if(fim == inicio) {
                return 1;
            } else {
                return fim - inicio;
            }
        } else {
            int i = (24 - inicio) + fim;
            return Math.min(i, 24);
        }
    }

    public static void main(String[] args) {
        TempoPartida partida = new TempoPartida(10, 14);

        System.out.println("Tempo da partida: " + partida.calcularTempo());
    }
}

/*
| Linha | Ação                                  | inicio | fim | calcularTempo | Saída                     |
|-------|---------------------------------------|--------|-----|---------------|---------------------------|
|   4   | Criação do construtor `TempoPartida`  |  -     |  -  |       -       |                           |
|   23  | Criação do objeto `TempoPartida`      |  10    | 14  |       -       |                           |
|   25  | Saída do cálculo                      |  10    | 14  |       4       | Tempo da partida: 4       |
*/