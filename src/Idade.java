import java.util.Scanner;

public class Idade {
    int dias, meses, anos;

    public Idade(int dias, int meses, int anos) {
        this.dias = dias;
        this.meses = meses;
        this.anos = anos;
    }

    public int idadeEmDias() {
        return(dias + meses*30 + anos*365);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seus anos de vida: ");
        int anos = sc.nextInt();
        System.out.println("Digite seus meses de vida: ");
        int meses = sc.nextInt();
        System.out.println("Digite seus dias de vida: ");
        int dias = sc.nextInt();
        Idade idade = new Idade(dias, meses, anos);

        System.out.printf("A sua idade em dias é de: %d",idade.idadeEmDias());
    }
}
