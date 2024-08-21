public class PositivoOuNegativo {
    public int x;

    public PositivoOuNegativo(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        PositivoOuNegativo numero = new PositivoOuNegativo(14);

        if (numero.x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }
    }
}