package aula_01;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		System.out.println(resp);
	}

}
