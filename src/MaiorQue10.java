import java.util.Scanner;

public class MaiorQue10 {
    public int num;

    public MaiorQue10(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        MaiorQue10 x = new MaiorQue10(num);

        if (x.num > 10) {
            System.out.println("MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        sc.close();
    }
}

/*
| Linha | Ação                                | x | (x>10) | Saída                 |
|-------|-------------------------------------|---|--------|-----------------------|
|   3   | Leitura do valor de `x`             | 8 |   -    |                -      |
|   4   | Leitura do valor de `y`             | 8 |   -    |                -      |
|   6   | Verifica se é maior que 10          | 8 |  true  | NÃO É MAIOR QUE 10!   |
*/
