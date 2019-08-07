import java.util.Scanner;

public class Questão12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float salario, novoSalario, aumento;
		char menu = ' ';
		
		System.out.println("Digite A - para calcular o aumento ou S - para sair");
		menu = entrada.nextLine().toUpperCase().charAt(0);
		
		while (menu == 'A') {
		  System.out.println("Digite o salário atual.");
		  salario = entrada.nextFloat();
		    if (salario <= 280) {
			     aumento = ((salario * 20) / 100);
			     novoSalario = (salario + aumento);
			     System.out.println("Salário antes do reajuste: " + salario);
			     System.out.println("O percentual de aumento foi de 20%");
			     System.out.println("O valor do aumento foi de: " + aumento);
			     System.out.println("Novo salário: " + novoSalario);
			     System.out.println("Digite A - para calcular o aumento ou S - para sair");
			     entrada.nextLine();
			     menu = entrada.nextLine().toUpperCase().charAt(0);
		    }else if ((salario > 280) && (salario <= 700)) {
		    	 aumento = ((salario * 15) / 100);
			     novoSalario = (salario + aumento);
			     System.out.println("Salário antes do reajuste: " + salario);
			     System.out.println("O percentual de aumento foi de 15%");
			     System.out.println("O valor do aumento foi de: " + aumento);
			     System.out.println("Novo salário: " + novoSalario);
			     System.out.println("Digite A - para calcular o aumento ou S - para sair");
			     entrada.nextLine();
			     menu = entrada.nextLine().toUpperCase().charAt(0);
		    }
		    if ((salario > 700) && (salario <= 1500)) {
		    	 aumento = ((salario * 10) / 100);
			     novoSalario = (salario + aumento);
			     System.out.println("Salário antes do reajuste: " + salario);
			     System.out.println("O percentual de aumento foi de 10%");
			     System.out.println("O valor do aumento foi de: " + aumento);
			     System.out.println("Novo salário: " + novoSalario);
			     System.out.println("Digite A - para calcular o aumento ou S - para sair");
			     entrada.nextLine();
			     menu = entrada.nextLine().toUpperCase().charAt(0);
		    }else if (salario > 1500) {
		    	aumento = ((salario * 5) / 100);
			     novoSalario = (salario + aumento);
			     System.out.println("Salário antes do reajuste: " + salario);
			     System.out.println("O percentual de aumento foi de 5%");
			     System.out.println("O valor do aumento foi de: " + aumento);
			     System.out.println("Novo salário: " + novoSalario);
			     System.out.println("Digite A - para calcular o aumento ou S - para sair");
			     entrada.nextLine();
			     menu = entrada.nextLine().toUpperCase().charAt(0);
		    }
		
		
		}
		entrada.close();
	}

}
