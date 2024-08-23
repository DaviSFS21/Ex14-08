import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int x = sc.nextInt();
        System.out.println("Numero 2: ");
        int y = sc.nextInt();

        System.out.println("Maior Número: " + Math.max(x, y));

        sc.close();
    }
}

/*
| Linha | Ação                                | x | y  | Math.max(x, y) | Saída                           |
|-------|-------------------------------------|---|----|----------------|---------------------------------|
|   3   | Leitura do valor de `x`             | 8 |  - |        -       |                -                |
|   4   | Leitura do valor de `y`             | 8 | 12 |        -       |                -                |
|   6   | Verifica o maior número             | 8 | 12 |       12       | Maior Número: 12                |
*/
