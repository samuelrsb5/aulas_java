package aula02;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		String resultado = letra == 'F' || letra == 'f' ? "Feminino" : letra == 'M' || letra == 'm' ? "Masculino" : "Inválido";
		System.out.println(resultado);
		
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino");
		} else if (letra == 'M' || letra == 'm') {
			System.out.println("Masculino");
		} else {
			System.out.println("Inválido");
		}
	}

}
