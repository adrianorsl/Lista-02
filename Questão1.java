import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada = new Scanner(System.in);
		
		float num1, num2;
		System.out.println("Digite o primeiro n�mero");
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo n�mero");
		num2 = entrada.nextFloat();
		
		if (num1 > num2) {
			System.out.println("o n�mero maior �: " + num1);
		}else if (num1 < num2) {
			System.out.println("o n�mero maior �: " + num2);
		}else {
			System.out.println("Os n�meros s�o iguais.");
		}
		entrada.close();
	}

}
