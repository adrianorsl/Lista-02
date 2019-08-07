import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float num1;
		System.out.println("Digite um número");
		num1 = entrada.nextFloat();
		if (num1 > 0) {
			System.out.println("O número e positivo");
		}else if (num1 < 0) {
			System.out.println("O número e negativo");
		}else {
			System.out.println("O número e 0");
		}
		entrada.close();
	}

}
