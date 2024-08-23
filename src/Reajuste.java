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
        Reajuste NovoSalario;
        NovoSalario = new Reajuste(970.0,30.0);

        System.out.printf("Salário atual: %.2f%nReajuste: %.2f%nNovo salário: R$%.2f", NovoSalario.SalarioAtual, NovoSalario.PercentReajuste, NovoSalario.SalarioNovo());
    }
}

/*
| Linha | Ação                          | SalarioAtual | PercentReajuste | SalarioNovo | Saída                                      |
|-------|-------------------------------|--------------|------------------|-------------|--------------------------------------------|
|  10   | Criação do objeto `Reajuste`  |  970.0       |    30.2         |      -      |           -                                |
|  12   | Cálculo do `SalarioNovo`      |  970.0    |    30.2         |   1261.94   | Salário atual: 970.00%nReajuste: 30.20%nNovo salário: R$1261.94 |
*/
