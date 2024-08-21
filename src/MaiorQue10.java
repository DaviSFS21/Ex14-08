public class MaiorQue10 {
    public int num;

    public MaiorQue10(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        MaiorQue10 x = new MaiorQue10(14);

        if (x.num > 10) {
            System.out.println("MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
