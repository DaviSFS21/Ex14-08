import java.util.Scanner;

public class Eleitor {
    int anoAtual, anoEleitor;

    public Eleitor(int anoAtual, int anoEleitor) {
        this.anoAtual = anoAtual;
        this.anoEleitor = anoEleitor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.println("Ano de nascimento do eleitor: ");
        int anoEleitor = sc.nextInt();
        
        Eleitor gabriel = new Eleitor(anoAtual, anoEleitor);

        if((gabriel.anoAtual - gabriel.anoEleitor) >= 16) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Não pode votar...");
        }
        
        sc.close();
    }
}
