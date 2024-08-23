public class TempConv {
    public Double f;

    public TempConv(Double f) {
        this.f = f;
    }

    public static void main(String[] args) {
        TempConv ftoc = new TempConv(74.0);

        System.out.println(((double) 5 / 9)*(ftoc.f - 32));
    }
}

/*
| Linha | Ação                                  | f    | Cálculo                 | Saída               |
|-------|---------------------------------------|------|-------------------------|---------------------|
|  10   | Criação do objeto `TempConv`          | 74.0 | ((5 / 9) * (74.0 - 32)) | 23.333333333333332  |
*/
