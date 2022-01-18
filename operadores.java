import java.util.Scanner;

class Operadores {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  
    int soma;
    int subt;
    int mult;
    double div;
    double rest;

System.out.println("digite o primeiro valor");
int valor1 = sc.nextInt();
System.out.println("digite o primeiro valor");
int valor2 = sc.nextInt();

   soma = valor1+valor2;
   subt = valor1-valor2;
   mult = valor1*valor2;
   div = valor1/ valor2;
   rest = valor1%valor2;
    
    
    System.out.println(" soma= "+soma+"\n subtração= "+subt+"\n multiplicação= "+mult+"\n divisao= "+div+"\n resto= "+rest);

    System.out.println("");

    boolean maq =valor1 > valor2;
    boolean meq =valor1 < valor2;
    boolean maqi =valor1 >= valor2;
    boolean meqi =valor1 <= valor2;
    boolean igual =valor1 == valor2;
    boolean dif =valor1 != valor2;

    System.out.println(" maior "+maq+"\n menor "+meq+"\n maior ou igual"+maqi+"\n menor ou igual "+meqi+"\n igual "+igual+"\n diferente "+dif);

  }
}
