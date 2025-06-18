package aula04;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double notas[] = new double[5];
		double valorNotas =0, media = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite notas: ");
			notas[i] = entrada.nextDouble();
		}
		
		for (double j : notas) {
			valorNotas += j;
		}
		
		media = valorNotas / notas.length;
		System.out.printf("A média das notas é %.2f", media);
		entrada.close();

	}

}
