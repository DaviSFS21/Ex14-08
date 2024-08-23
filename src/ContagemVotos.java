import java.util.Scanner;

public class ContagemVotos {
    int total;
    Double branco, nulo, valido;

    public ContagemVotos(int Total, Double Branco, Double Nulo, Double Valido) {
        this.total = Total;
        this.branco = Branco;
        this.nulo = Nulo;
        this.valido = Valido;
    }

    public Double porcentValido() {
        return (valido * 100) / total;
    }

    public Double porcentBranco() {
        return (branco * 100) / total;
    }

    public Double porcentNulo() {
        return (nulo * 100) / total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total de votos: ");
        int total = sc.nextInt();
        System.out.println("Digite o valor de votos Brancos: ");
        double branco = sc.nextDouble();
        System.out.println("Digite o valor de votos Nulos: ");
        double nulo = sc.nextDouble();
        System.out.println("Digite o valor de votos Validos: ");
        double valido = sc.nextDouble();

        ContagemVotos eleicao = new ContagemVotos(total, branco, nulo, valido);

        System.out.println(eleicao.porcentValido());

        System.out.printf("Total de votos: %d %nBranco: %.2f %nNulo: %.2f %nValido: %.2f %n",eleicao.total,eleicao.porcentBranco(),eleicao.porcentNulo(),eleicao.porcentValido());

        sc.close();
    }
}

/*
| Linha | Ação                                  | total | branco | nulo | valido | porcentValido | porcentBranco | porcentNulo | Saída                                          |
|-------|---------------------------------------|-------|--------|------|--------|---------------|---------------|-------------|------------------------------------------------|
|  10   | Criação do objeto `ContagemVotos`     | 153.0 | 5.0    | 8.0  | 74.0   |       -       |       -       |      -      |   -                                            |
|  16   | Chamada do método `porcentValido`     |   -   |   -    |  -   |   -    |     48.37     |       -       |      -      | 48.37                                          |
|  18   | Chamada do método `porcentBranco`     |   -   |   -    |  -   |   -    |       -       |     3.27      |      -      | Total de votos: 153.00                          |
|  18   | Chamada do método `porcentNulo`       |   -   |   -    |  -   |   -    |       -       |       -       |    5.23     | Branco: 3.27                                    |
|  18   | Chamada do método `porcentValido`     |   -   |   -    |  -   |   -    |     48.37     |       -       |      -      | Nulo: 5.23                                      |
|  18   | Impressão dos resultados calculados   |   -   |   -    |  -   |   -    |       -       |       -       |      -      | Valido: 48.37                                   |
*/


