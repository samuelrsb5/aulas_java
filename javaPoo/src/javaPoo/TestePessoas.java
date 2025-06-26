package javaPoo;

public class TestePessoas {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Samuel";
		p1.altura = 1.78;
		p1.idade = 20;
		p1.genero = "M";
		
		p1.comer("paçoca");
		p1.exibirAtributos();
	}

}
