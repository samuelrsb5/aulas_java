package aula03;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		double qtndAlunos = entrada.nextDouble();
		double soma = 0;
		for(int i = 0; i < qtndAlunos; i++){
			System.out.print("Digite as notas dos alunos: ");
			double notas = entrada.nextDouble();
			soma += notas;
		}
		double media = soma / qtndAlunos;
		System.out.printf("A media dos alunos é: %.2f", media);
		entrada.close();
	}
}