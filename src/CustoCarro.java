public class CustoCarro {
    Double CustoFabrica;

    public CustoCarro(Double CustoFabrica) {
        this.CustoFabrica = CustoFabrica;
    }

    public Double CustoFinal() {
        return CustoFabrica + CustoFabrica*0.28 + CustoFabrica*0.45;
    }

    public static void main(String[] args) {
        CustoCarro PrecoFinal;
        PrecoFinal = new CustoCarro(40000.);

        System.out.printf("Um carro que custa R$%.2f para ser montado valerá R$%.2f ao consumidor final.",PrecoFinal.CustoFabrica,PrecoFinal.CustoFinal());
    }
}
