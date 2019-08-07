import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float num1, num2, num3;
		System.out.println("Digite o primeiro número.");
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo número.");
		num2 = entrada.nextFloat();
		System.out.println("Digite o terceiro número.");
		num3 = entrada.nextFloat();
		if ((num1 < num2 ) && (num1 < num3)) {
			if (num2 < num3) {
				System.out.println(num3 + "\n" + num2 + "\n" + num1 );
			}else
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
		}else if ((num2 < num1 ) && (num2 < num3)) {
			if (num1 < num3) {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}else {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			}
		}else
			if (num1 < num2) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			}else {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			}
		entrada.close();
	}

}
