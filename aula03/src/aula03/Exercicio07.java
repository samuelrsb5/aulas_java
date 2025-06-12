package aula03;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int a1[] = new int[4];
		int a2[] = new int[4];
		int a3[] = new int[4];
		int a4[] = new int[4];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			
			
			System.out.println("Digite números para o array 1: ");
			int numeros = entrada.nextInt();
			a1[i] = numeros;
			
			System.out.println("Digite números para o array 2: ");
			numeros = entrada.nextInt();
			a2[i] = numeros;
			
			System.out.println("Digite números para o array 3: ");
		    numeros = entrada.nextInt();
			a3[i] = numeros;
			
			System.out.println("Digite números para o array 4: ");
			numeros = entrada.nextInt();
			a4[i] = numeros;
			
			
		}
	}

}
