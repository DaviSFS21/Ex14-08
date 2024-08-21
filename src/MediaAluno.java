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
        MediaAluno mediaJoao = new MediaAluno(5.0, 7.0);

        System.out.printf("Nota 1: %f%nNota 2: %f%n%nSituação: %s", mediaJoao.nota1, mediaJoao.nota2, mediaJoao.verifAprov(mediaJoao.nota1, mediaJoao.nota2));
    }
}
