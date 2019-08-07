import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada = new Scanner(System.in);
		
		float num1, num2;
		System.out.println("Digite o primeiro número");
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo número");
		num2 = entrada.nextFloat();
		
		if (num1 > num2) {
			System.out.println("o número maior é: " + num1);
		}else if (num1 < num2) {
			System.out.println("o número maior é: " + num2);
		}else {
			System.out.println("Os números são iguais.");
		}
		entrada.close();
	}

}
