package aula03;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		double qtndAlunos = entrada.nextDouble();
		int contador = 0;
		int soma = 0;
		
		while(contador < qtndAlunos){
			System.out.print("Digite as notas dos alunos: ");
			double notas = entrada.nextDouble();
			contador++;
			soma += notas;
		}
		
		double media = soma / qtndAlunos;
		
		System.out.printf("A media dos alunos é: %.2f", media);
		entrada.close();
		

	}

}
