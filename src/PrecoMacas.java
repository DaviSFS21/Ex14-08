import java.util.Scanner;

public class PrecoMacas {
  int quantMacas;
  
  public PrecoMacas(int quantMacas) {
    this.quantMacas = quantMacas;  
  }

  public double calcPreco() {
    if(quantMacas >= 12) {
        return quantMacas*1;
    } else {
        return quantMacas*1.3;
    }
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de maçãs: ");
    int x = sc.nextInt();
    
    PrecoMacas compra = new PrecoMacas(x);

    System.out.printf("O preço das maçãs é: R$%.2f", compra.calcPreco());

    sc.close();
  }
}