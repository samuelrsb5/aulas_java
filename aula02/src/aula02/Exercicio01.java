package aula02;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite 1: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite 2: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite 3: ");
		int num3 = entrada.nextInt();
		
		/*
		 * if (num1 > num2 && num1 > num3) { System.out.println(num1); } else if (num2 >
		 * num1 && num2 > num3 ) { System.out.println(num2); }else if(num3 > num1 &&
		 * num3 > num2) { System.out.println(num3); }
		 */
		
		/*
		 * System.out.println((num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2
		 * > num3) ? num2 : (num3 > num1 && num3 > num2) ? num3 : "Inválido");
		 */
		
		int maiorValor = Math.max(Math.max(num1, num2), num3);
		
		System.out.print(maiorValor);
		
		
		
		
		

	}

}
