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

        sc.close();
    }
}

/*
| Linha | Ação                                    | dias | meses | anos | idadeEmDias | Saída                             |
|-------|-----------------------------------------|------|-------|------|-------------|-----------------------------------|
|  14   | Leitura do valor de `anos`              |   -  |   -   |  25  |      -      |    -                              |
|  16   | Leitura do valor de `meses`             |   -  |   6   |   -  |      -      |    -                              |
|  18   | Leitura do valor de `dias`              |  15  |   -   |   -  |      -      |    -                              |
|  19   | Criação do objeto `Idade`               |  15  |   6   |  25  |      -      |    -                              |
|  21   | Cálculo da idade em dias                |  15  |   6   |  25  |   9320      | A sua idade em dias é de: 9320    |
*/
