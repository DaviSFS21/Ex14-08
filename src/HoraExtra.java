import java.util.Scanner;

public class HoraExtra {
    int HrsTrab;
    double SalHora;

    public HoraExtra(int HrsTrab, double SalHora) {
        this.HrsTrab = HrsTrab;
        this.SalHora = SalHora;
    }

    public double calcSalFinal() {

        if (HrsTrab > 160) {
            return (SalHora * 160) + (HrsTrab - 160) * SalHora * 1.5;
        } else {
            return (SalHora * 160);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário por hora: ");
        double SalHora = sc.nextDouble();
        System.out.println("Digite a quantia de horas trabalhadas: ");
        int HrsTrab = sc.nextInt();

        HoraExtra gabriel = new HoraExtra(HrsTrab, SalHora);

        System.out.printf("O salário total do funcionário é: R$%.2f",gabriel.calcSalFinal());

        sc.close();
    }
}

/*
| Linha | Ação                                               | HrsTrab | SalHora | calcSalFinal | Saída                    |
|-------|----------------------------------------------------|---------|---------|--------------|--------------------------|
|  18   | Leitura do valor de `SalHora`                      |    -    |  50.0   |      -       |    -                     |
|  20   | Leitura do valor de `HrsTrab`                      |   170   |    -    |      -       |    -                     |
|  22   | Criação do objeto `HoraExtra`                      |   170   |  50.0   |      -       |    -                     |
|  24   | Avaliação da condição `HrsTrab > 160`              |   170   |  50.0   |      -       | O salário total do       |
|  24   | Cálculo do salário final                           |   170   |  50.0   |   8750.0     | funcionário é: R$8750.00 |
*/
