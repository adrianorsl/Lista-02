import java.util.Scanner;

public class Questão9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada = new Scanner(System.in);
		float peso;
		double alturaH, idealH, alturaF, idealF;
		char sexo = ' ';
		
		System.out.println("Informe sexo, M masculino ou F feminino.");
		sexo = entrada.nextLine().toUpperCase().charAt(0);
		
		
		if (sexo == 'M') {
		    System.out.println("Digite sua altura em metros.");
		    alturaH = entrada.nextDouble();
		    System.out.println("Digite seu peso.");
		    peso = entrada.nextFloat();
		    idealH = ((72.2 * alturaH) - 58);
		    if (idealH > peso) {
		    	System.out.println("Altura: " + alturaH + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealH);
		    	System.out.println("Você está abaixo do peso.");
		    }else if (idealH < peso) {
		    	System.out.println("Altura: " + alturaH + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealH);
		    	System.out.println("Você está acima do peso.");
		    }else {
		    	System.out.println("Altura: " + alturaH + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealH);
		    	System.out.println("Você está dentro do peso ideal.");
		    }
		    
	    
		} else if (sexo == 'F') {
			
	    	System.out.println("Digite sua altura em metros.");
	        alturaF = entrada.nextDouble();
	        System.out.println("Digite seu peso.");
		    peso = entrada.nextFloat();
	        idealF = ((62.1 * alturaF) - 44.7);	
	        if (idealF > peso) {
		    	System.out.println("Altura: " + alturaF + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealF);
		    	System.out.println("Você está abaixo do peso.");
		    }else if (idealF < peso) {
		    	System.out.println("Altura: " + alturaF + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealF);
		    	System.out.println("Você está acima do peso.");
		    }else {
		    	System.out.println("Altura: " + alturaF + " Peso: " + peso + " Sexo: " + sexo );
		    	System.out.println("Seu peso ideal é: " + idealF);
		    	System.out.println("Você está dentro do peso ideal.");
		    }
	    
		} else {
	    	System.out.println("sexo invalido");
		}
		
		entrada.close();
	}

}
