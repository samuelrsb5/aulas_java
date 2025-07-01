package javaPoo2;

public class Cavalo {
	String nome;
	public Cavalo() {
		
	}
	public Cavalo(String nome) {
		this.nome = nome;
	}
	
	public void comer() {
		System.out.println("Foi de comes");
	}
	
	final void comer(String comida) {
		System.out.printf("Foi comer %s", comida);
	}
	
	//se o final estiver na frente de uma classe ela está impossibilitada de ter herança
	//se estiver na frente de atributos ele se torna absoluto
	//se estiver na frente do metodo ele nao pode ser subscrito
	//abstract impede que sejam criados objetos a partir daquela classe
	//static em atributos faz com que aquele atributo seja estatico em todas as classes filhas
}	
