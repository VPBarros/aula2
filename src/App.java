import java.util.Scanner;

//**// sintaxe opcional switch case ao inves de varios if else usa-se switch-case(sem (parentese ) 
//e com letras minusculas)
//permitindo especificar código diferente para ser executado em várias condições.
//recebe um valor como parâmetro e verifica se ele atende alguma das (condições) especificadas
//comando DEFAULT é executado quando nenhum dos valores é executado, já o comando BREAK determina 
//fim de uma das opções de comando no CASE.
//**para rodar no console digite numero de 1 a 7 e aparecera o dia da semana correspodente.

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x){
		 case 1:
		  dia = "Domingo";
		   break;
		case 2:
			dia = "Segunda feira";
			break;
		case 3:
			dia = "Terça feira";
			break;
		case 4:
			dia = "Quarta feira";
			break;
		case 5:
			dia = "Quinta feira";
			break;
		case 6:
			dia ="Sexta feira";
			break;
		case 7:
			dia = "sabado";
			break;
			default:
				dia = ("Valor Invalido!");
				
		}
		 System.out.println("Dia da semana:"+dia);
		 
  sc.close();
	
		

    }
}
