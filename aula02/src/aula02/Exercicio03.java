package aula02;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite notas: ");
		double num1 = entrada.nextInt();
		
		System.out.println("Digite notas: ");
		double num2 = entrada.nextInt();
		
		double media = (num1 + num2) / 2;
		
		System.out.println(media);
		
		

	}

}
