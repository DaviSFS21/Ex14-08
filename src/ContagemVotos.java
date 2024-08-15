public class ContagemVotos {
    Double Total,Branco,Nulo,Valido;

    public ContagemVotos(Double Total, Double Branco, Double Nulo, Double Valido) {
        this.Total = Total;
        this.Branco = Branco;
        this.Nulo = Nulo;
        this.Valido = Valido;
    }

    public Double porcentValido() {
        return (Valido * 100) / Total;
    }

    public Double porcentBranco() {
        return (Branco * 100) / Total;
    }

    public Double porcentNulo() {
        return (Nulo * 100) / Total;
    }

    public static void main(String[] args) {

        ContagemVotos eleicao = new ContagemVotos(153.0, 5.0, 8.0, 74.0);

        System.out.println(eleicao.porcentValido());

        System.out.printf("Total de votos: %.2f %nBranco: %.2f %nNulo: %.2f %nValido: %.2f %n",eleicao.Total,eleicao.porcentBranco(),eleicao.porcentNulo(),eleicao.porcentValido());
    }
}
