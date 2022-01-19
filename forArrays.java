import java.util.Scanner;

class forArrays {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    // maneiras de como declarar um arrays
    String[] palavras = new String[10];
    String[] nomes = { "joao", "maria" };
    int[] idades = new int[10];
    double[] notas = new double[10];

    palavras[0] = "bike";
    palavras[1] = "metro";

    System.out.println(palavras[0]);
    System.out.println(nomes[1]);

    
    for (int i = 0; i < 9; i++) {
      System.out.println("idades: " + idades[i]);
    }

System.out.println("");

    
    for (int i = 0; i < idades.length; i++) {

      System.out.println("digite uma nova idade");
      idades[i] = leia.nextInt();
      System.out.println("idades: " + idades[i]);
    }

System.out.println("");

for (int i = 0; i < 10; i++) {
      System.out.println("idades: " + idades[i]);
    }

 
  }
}