import java.util.Scanner;

public class Questão8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, media;
		System.out.println("Digite a primeira nota.");
		nota1 = entrada.nextFloat();
		System.out.println("Digite a primeira nota.");
		nota2 = entrada.nextFloat();
        media = ((nota1 + nota2) / 2) ;
        if (media >= 7) {
        	System.out.println("Aprovado");
        }else {
        	System.out.println("Reprovado");
        }
		
		entrada.close();
	}

}
