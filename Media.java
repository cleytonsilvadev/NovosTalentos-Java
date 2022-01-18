 import java.util.Scanner;

class Media {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  

System.out.println("digite o primeiro valor");
double nota1 = sc.nextDouble();
System.out.println("digite o segunda valor");
double nota2 = sc.nextDouble();
System.out.println("digite terceira valor");
double nota3 = sc.nextDouble();
System.out.println("digite o quarta valor");
double nota4 = sc.nextDouble();

double media=  (nota1+nota2+nota3+nota4)/4;
    
    
    System.out.println("a media do aluno é :"+media);

    

  }
}
