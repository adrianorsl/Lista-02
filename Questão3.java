import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
		
		char sexo = ' ';
		System.out.println("Digiteo sexo M-Masculino ou F-Feminino");
		sexo = entrada.nextLine().toUpperCase().charAt(0);
		if (sexo == 'M') {
			System.out.println( sexo + " - Masculino");
		}else if (sexo == 'F') {
			System.out.println( sexo + " - Feminino");
		}else {
			System.out.println("Letra inválida");
	}
		entrada.close();
  }
}

