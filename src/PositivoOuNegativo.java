import java.util.Scanner;

public class PositivoOuNegativo {
    public int x;

    public PositivoOuNegativo(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = sc.nextInt();

        PositivoOuNegativo numero = new PositivoOuNegativo(x);
        if (numero.x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}