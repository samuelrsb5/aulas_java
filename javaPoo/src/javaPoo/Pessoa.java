package javaPoo;

public class Pessoa {
	String nome;
	int idade;
	double altura; 
	String genero; 
	
	public void comer(String comida) {
		System.out.printf("%s começou a comer %s\n", nome, comida);
	}
	
	public void exibirAtributos() {
		System.out.printf("%s\n%d\n%.2f\n%s\n", nome, idade, altura, genero);
	}
}