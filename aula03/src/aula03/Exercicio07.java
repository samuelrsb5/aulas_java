package aula03;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		int a1[] = new int[4];
		int a2[] = new int[4];
		int a3[] = new int[4];
		int a4[] = new int[4];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			
			
			System.out.println("Digite números para o array 1: ");
			a1[i] = entrada.nextInt();
			
			System.out.println("Digite números para o array 2: ");
			a2[i] = entrada.nextInt();
			
			System.out.println("Digite números para o array 3: ");
			a3[i] = entrada.nextInt();
			
			System.out.println("Digite números para o array 4: ");
			a4[i] = entrada.nextInt();
			
			
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
	}

}
