import java.util.Scanner;

public class Quest�o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float num1;
		System.out.println("Digite um n�mero");
		num1 = entrada.nextFloat();
		if (num1 > 0) {
			System.out.println("O n�mero e positivo");
		}else if (num1 < 0) {
			System.out.println("O n�mero e negativo");
		}else {
			System.out.println("O n�mero e 0");
		}
		entrada.close();
	}

}
