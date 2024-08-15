public class Reajuste {
    Double SalarioAtual, PercentReajuste;

    public Reajuste(Double SalarioAtual, Double PercentReajuste) {
        this.SalarioAtual = SalarioAtual;
        this.PercentReajuste = PercentReajuste;
    }

    public Double SalarioNovo() {
        return SalarioAtual + (PercentReajuste/100) * SalarioAtual;
    }

    public static void main(String[] args) {
        Reajuste novoSalario;
        novoSalario = new Reajuste(970.0,30.2);

        System.out.printf("Salário atual: %.2f%nReajuste: %.2f%nNovo salário: R$%.2f",novoSalario.SalarioAtual,novoSalario.PercentReajuste,novoSalario.SalarioNovo());
    }
}
