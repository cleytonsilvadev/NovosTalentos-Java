import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    
  Scanner leia = new Scanner(System.in);

    System.out.println("--------Campanha de Vacinação--------");
    System.out.println("(Municípios Pernambucanos: Ingazeira)\n");
    System.out.println("Quantos Cadastros Você Deseja Fazer?");
    int j = leia.nextInt();
    // j=300;

    String nomes[] = new String[j];
		String cpfs[] = new String[j];
    String contatos[] = new String[j];
		//so cadastrar pessoas acima dos 60 anos de idade
		int idades[] = new int[j];
		
		
		
    
		for( int i = 0; i < nomes.length; i++){
		  System.out.println("\n-----------------------");
        System.out.println("Digite a idade");
				  idades[ i ] = leia.nextInt();
                                         
           if(idades[i] > 60){
             System.out.println("\n-----------------------");
             nomes[i] = leia.nextLine();
          
             System.out.println("Digite o nome");
		         nomes[i] = leia.nextLine();
		  
             System.out.println("\n-----------------------");
             System.out.println("Digite o cpf");
			       cpfs[ i ] = leia.nextLine();
       
             System.out.println("\n-----------------------");
				     System.out.println("Digite numero de contato");
				     contatos[ i ] = leia.nextLine();
           
				 }else{
           i--; 
          System.out.println("idade abaixo do esperado ");
       }	
		}

    for(int i = 0; i <40; i++){
System.out.print("\r\n");
  }
     for(int i = 0; i < j; i++){ System.out.println("paciente" +":"+nomes[i]+" ,com a idade de "+idades[i]+" ,dono do cpf: "+cpfs[i]+" ,numero de contato: "+contatos[i]);
       
      }   
				
			
		
		
		
    
    }
}


