import java.util.Scanner;

public class Quest�o6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um n�mero inteiro.");
		num = entrada.nextInt();
		if ((num % 2) == 0 ) {
			num = (num + 1);
			System.out.println(num);
		}else {
			num = (num + 1);
			System.out.println(num);
		}
		
		entrada.close();
		
	}

}
