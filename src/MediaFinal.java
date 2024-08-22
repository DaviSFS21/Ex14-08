import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        double P1, E1, E2, API, SUB, X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota da P1: ");
        P1 = sc.nextDouble();
        System.out.println("Insira a nota do E1: ");
        E1 = sc.nextDouble();
        System.out.println("Insira a nota do E2: ");
        E2 = sc.nextDouble();
        System.out.println("Insira a nota da API: ");
        API = sc.nextDouble();
        System.out.println("Insira a nota da SUB: ");
        SUB = sc.nextDouble();
        System.out.println("Insira a nota extra(X): ");
        X = sc.nextDouble();

        double x = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        double y = (Math.max((x - 5.9),0) / (x - 5.9));

        double mediaFinal = x * 0.5 + y * (API * 0.5) + X + (SUB * 0.2);

        System.out.println("Media Final: " + Math.min(10,mediaFinal));
    }
}
