public class Idade {
    int dias,meses,anos;

    public Idade(int dias, int meses, int anos) {
        this.dias = dias;
        this.meses = meses;
        this.anos = anos;
    }

    public Idade(int dias, int meses) {
        this.dias = dias;
        this.meses = meses;
        this.anos = 0;
    }

    public int idadeEmDias() {
        return(dias + meses*30 + anos*365);
    }

    public static void main(String[] args) {
        Idade pessoa = new Idade(23,9,18);

        System.out.printf("A sua idade em dias é de: %d",pessoa.idadeEmDias());
    }
}
