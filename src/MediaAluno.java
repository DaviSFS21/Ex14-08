import java.util.Scanner;

public class MediaAluno {
    public Double nota1, nota2;

    public MediaAluno(Double nota1, Double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String verifAprov(Double nota1, Double nota2) {
        if (((nota1 + nota2) / 2) >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        Double nota2 = sc.nextDouble();

        MediaAluno mediaJoao = new MediaAluno(nota1, nota2);

        System.out.printf("Nota 1: %.2f%nNota 2: %.2f%n%nSituação: %s", mediaJoao.nota1, mediaJoao.nota2, mediaJoao.verifAprov(mediaJoao.nota1, mediaJoao.nota2));

        sc.close();
    }
}

/*
| Linha | Ação                                          | nota1 | nota2 | verifAprov | Saída               |
|-------|-----------------------------------------------|-------|-------|------------|---------------------|
|  14   | Leitura do valor de `nota1`                   |  7.5  |   -   |     -      |    -                |
|  16   | Leitura do valor de `nota2`                   |  7.5  |  5.0  |     -      |    -                |
|  18   | Criação do objeto `MediaAluno`                |  7.5  |  5.0  |     -      |    -                |
|  20   | Chamada do método `verifAprov`                |  7.5  |  5.0  | Aprovado   | Situação: Aprovado |
*/
