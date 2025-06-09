package aula_01;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um número");
		int resp = num.nextInt();
		
		/*
		 * if(resp > 0) { System.out.println("Positivo"); } else {
		 * System.out.println("Negativo"); }
		 */
		
		System.out.print(resp == 0 ? "é zero" : (resp > 0 ? "positivo" : "negativo"));

	}

}
