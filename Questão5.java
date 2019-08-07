import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		char letra = ' ';
		System.out.println("Digite uma letra");
		letra = entrada.nextLine().toUpperCase().charAt(0);
		
		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
			System.out.println("É vogal.");
		}else {
			System.out.println("Não e vogal.");
		}
		entrada.close();
	}

}
