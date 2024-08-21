public class GastosTrim {
    public Double jan, fev, mar;

    public GastosTrim(Double jan, Double fev, Double mar) {
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
    }

    public Double gastosTotais(Double jan, Double fev,Double mar) {
        return jan + fev + mar;
    }

    public static void main(String[] args) {
        GastosTrim Cube = new GastosTrim(15000.0, 23000.0, 17000.0);

        System.out.printf("Nota 1: %f%nNota 2: %f%n%nSituação: %s", Cube.jan, Cube.fev, Cube.gastosTotais(Cube.jan, Cube.fev, Cube.mar));
    }
}