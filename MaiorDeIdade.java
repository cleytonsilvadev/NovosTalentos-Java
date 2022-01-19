import java.util.Scanner;

class MaiorDeIdade {

  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    String nome= " ";
    int anoNascimento= 0,anoAtual=2022,idade=0;

    System.out.println("nome da pessoa");
    nome = leia.next();

    System.out.println("ano de nascimneto");
    anoNascimento= leia.nextInt();
   
   idade=anoAtual-anoNascimento;

    if (idade < 18) {
       System.out.printf(nome+" tem "+idade+" ele(a) é menor de idade"); 
    } else {
       System.out.printf(nome+" tem "+idade+" ele(a) é maior de idade");
    }

    
  

  }
}