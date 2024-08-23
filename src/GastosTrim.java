public class GastosTrim {
    public Double jan, fev, mar;

    public GastosTrim(Double jan, Double fev, Double mar) {
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
    }

    public Double somarGastos(Double jan, Double fev, Double mar) {
        return jan + fev + mar;
    }

    public static void main(String[] args) {
        GastosTrim Cube = new GastosTrim(20000.0, 23000.0, 17000.0);

        System.out.printf("Gastos em janeiro: R$%.2f%nGastos em fevereiro: R$%.2f%nGastos em março: R$%.2f%n%nGastos no trimestre: R$%.2f%nMédia de gastos: R$%.2f", Cube.jan, Cube.fev, Cube.mar, Cube.somarGastos(Cube.jan, Cube.fev, Cube.mar), (Cube.somarGastos(Cube.jan, Cube.fev, Cube.mar)/3));
    }
}

/*
| Linha | Ação                                            | `Cube.jan` | `Cube.fev` | `Cube.mar` | somarGastos() | somarGastos/3 | Saída                             |
|-------|-------------------------------------------------|------------|------------|------------|---------------|---------------|-----------------------------------|
| 10    | Criação do objeto `Cube`                        | `20000.0`  | `23000.0`  | `17000.0`  | -             | -             | Gastos em janeiro: R$20000.00     |
| 13    | Impressão dos valores de `jan`, `fev`, e `mar`  | `20000.0`  | `23000.0`  | `17000.0`  | -             | -             | Gastos em fevereiro: R$23000.00   |
| 13    | Chamada de `somarGastos` e cálculo da soma      | `20000.0`  | `23000.0`  | `17000.0`  | `60000.0`     | -             | Gastos em março: R$17000.00       |
| 13    | Impressão da soma dos gastos no trimestre       | `20000.0`  | `23000.0`  | `17000.0`  | `60000.0`     | -             |                                   |
| 13    | Cálculo da média dos gastos                     | `20000.0`  | `23000.0`  | `17000.0`  | `60000.0`     | `20000.0`     | Gastos no trimestre: R$60000.00   |
| 13    | Impressão da média dos gastos                   | `20000.0`  | `23000.0`  | `17000.0`  | `60000.0`     | `20000.0`     | Média de gastos: R$20000.00       |
*/