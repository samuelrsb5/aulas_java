package javaPoo2;

public class Fazenda {

	public static void main(String[] args) {
		Cavalo c1 = new Cavalo();
		c1.comer("Ração\n");
		c1.nome = "Carlão da firma";
		System.out.println(c1.nome);
		
		Cavalo c2 = new Cavalo("Manoel Victor");
		System.out.println(c2.nome);
	}

}
