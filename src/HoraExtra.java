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
