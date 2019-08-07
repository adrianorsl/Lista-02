import java.util.Scanner;

public class Questão11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		char periodo = ' ';
		System.out.println("Em que período você estuda?\nDigite M - Matutino, V - Vespertino ou N - Noturno");
		periodo = entrada.nextLine().toUpperCase().charAt(0);
		
		while ((periodo != 'M') || (periodo != 'V') || (periodo != 'N') ) { 
	        while ((periodo == 'M') || (periodo == 'V') || (periodo == 'N') ) {
		         if (periodo == 'M') {
			         System.out.println("Bom Dia!.");
		         }else if (periodo == 'V') {
			         System.out.println("Boa Tarde!.");
		         }else {
			         System.out.println("Boa Noite!.");
		         }
		    break;
	       }
	        periodo = entrada.nextLine().toUpperCase().charAt(0);  
		}
		entrada.close();
	}

}
