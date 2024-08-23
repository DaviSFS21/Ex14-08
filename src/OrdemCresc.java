import java.util.Scanner;

public class OrdemCresc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int x = sc.nextInt();
        System.out.println("Numero 2: ");
        int y = sc.nextInt();


        if(x > y) { System.out.println(x + " > " + y); }
        else { System.out.println(y + " > " + x); }

        sc.close();
    }
}

/*
| Linha | Ação                            | x  | y  | Saída         |
|-------|---------------------------------|----|----|---------------|
|   7   | Leitura do valor de `x`          |  5 |  - |       -       |
|   8   | Leitura do valor de `y`          |  5 | 10 |       -       |
|  11   | Avaliação da condição `x > y`    |  5 | 10 |       -       |
|  12   | Impressão de `y > x`             |  5 | 10 | 10 > 5        |
*/
