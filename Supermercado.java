import java.util.Scanner;

class Supermercado {

  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    String nomeProduto = " ";
    double preco = 0, total = 0, quant = 0;

    
    System.out.println("quantidade de produto no carrinho de compras");
    quant = leia.nextDouble();

    for(int i=1 ; i <= quant ; i++){
       System.out.println("nome do produto");
    nomeProduto = leia.next();

    System.out.println("preco do "+i+" produto");
    preco = leia.nextDouble();

    total = total+preco;
    }
    
    System.out.printf("total das compras "+ total+ "$");

  }
}
