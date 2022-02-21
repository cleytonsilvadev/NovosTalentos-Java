/*
Você foi contratado por uma empresa que desenvolverá um programa computacional que registrará informações referente a uma campanha de vacinação de uma determinada variante de um determinado vírus descoberto recentemente no mundo. O software será utilizado em três municípios pernambucanos: Ingazeira, Itacuruba e Calumbi. Há um planejamento de enviar um número X de doses iniciais para estes municípios de forma proporcional, mas devido a falta de insumos cada cidade receberá o número de doses de forma proporcional ao número de habitantes. Assim, serão neste primeiro momento produzidas 1000 (mil) doses. Distribuídas na seguintes proporção de quantidades de doses referente as 1000 doses: Ingazeira 30%, Itacuruba 32%, Calumbi 38%. Cada município deste tem suas particularidades referentes as informações que serão registradas. Por isso, foram alocados três programadores, um para cada algoritmo que será escrito para cada cidade. E você foi um dos programadores escolhidos. Mas, você poderá escolher para qual cidade escreverá o algoritmo. Você só pode escolher um das três cidades. Todas as cidades precisarão salvar os dados para o cadastro tais como: nome, CPF e idade. Segue as exigências específicas para cada cidade. Opção 1 - Ingazeira: I - solicitar o número de telefone; II - só cadastra pessoas acima dos 60 anos de idade; III - Imprimir uma lista de cadastrados (lista com nomes ou com CPFs). Opção 2 - Itacuruba: I - solicitar a quantidade de pessoas que moram na residência (incluindo quem está se cadastrando) e registrar; II - Permitir a consulta de um registro por CPF a fim de ver se já se cadastrou (isto não é uma restrição apenas uma consulta posterior a todos os cadastros). III - Imprimir a média de idades cadastradas. Não tem restrição quanto a idade (qualquer idade pode se vacinar). Opção 3 - Calumbi, neste município haverá também o cadastro dos funcionários envolvidos na vacina, por isso: I - solicitar a quantidade de funcionários que irão trabalhar na vacina e logo após registrar a matrícula de cada um; II - consultar se o funcionário já foi cadastrado (isto não é uma restrição apenas uma consulta posterior a todos os cadastros); III - Listar as idades cadastradas. Neste também NÃO há restrição de idade. Desta forma, escolha apenas, e somente, uma das três opções, escreva o algoritmo em qualquer IDE, copie e cole o código aqui. *
*/
import java.util.Scanner;
class CampanhaDeVacinação {
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


