import java.util.Scanner;

public class CustoCarro {
    Double custoFabrica;

    public CustoCarro(Double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public Double CustoFinal() {
        return custoFabrica + custoFabrica*0.28 + custoFabrica*0.45;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Custo de fábrica: ");
        double x = sc.nextDouble();

        CustoCarro PrecoFinal;
        PrecoFinal = new CustoCarro(x);

        System.out.printf("Um carro que custa R$%.2f para ser montado valerá R$%.2f ao consumidor final.",PrecoFinal.custoFabrica,PrecoFinal.CustoFinal());

        sc.close();
    }
}

/*
| Linha | Ação                              | custoFabrica | CustoFinal | Saída                                                                                         |
|-------|-----------------------------------|--------------|------------|------------------------------------------------------------------------------------------------|
|   4   | Criação do objeto `CustoCarro`    | 40000.0      |    -       |   -                                                                                             |
|   8   | Chamada do método `CustoFinal`    | 40000.0      | 69200.0    | Um carro que custa R$40000.00 para ser montado valerá R$69200.00 ao consumidor final.           |
*/

