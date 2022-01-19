import java.util.Scanner;

class desconto {

  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    String nomeProduto = " ";
    double preco = 0, total = 0, desconto = 0;

    System.out.println("nome do produto");
    nomeProduto = leia.next();

    System.out.println("preco do produto");
    preco = leia.nextDouble();
    if (preco >= 1000) {
      desconto = 50;
    } else {
      desconto=0;
    }

    total = preco - desconto;
    System.out.printf("total do produto "+ total+ "$");

  }
}