public class RevendaCarro {
    Double salario, comissaoFixa, totalVendas;
    int carrosVendidos;

    public RevendaCarro(Double salario, Double comissaoPorVenda, double totalVendas, int carrosVendidos) {
        this.salario = salario;
        this.comissaoFixa = comissaoPorVenda;
        this.totalVendas = totalVendas;
        this.carrosVendidos = carrosVendidos;
    }

    public Double SalarioTotal() {
        return salario + (comissaoFixa * carrosVendidos) + (totalVendas * 0.05);
    }

    public static void main(String[] args) {
        RevendaCarro funcionario = new RevendaCarro(2200.0, 20.0, 40000.0, 3);

        System.out.printf("Salário fixo: R$%.2f%nComissão fixa: R$%.2f/carro%nCarros vendidos: %d%nValor total de vendas: " +
                "R$%.2f%n%nSalário final: R$%.2f",
                funcionario.salario,
                funcionario.comissaoFixa,
                funcionario.carrosVendidos,
                funcionario.totalVendas,
                funcionario.SalarioTotal());
    }
}
