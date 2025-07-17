package acabou2;

public class TriAtleta implements Corredor, Nadador, Ciclista {

	@Override
	public void pedalar() {
		System.out.println("Pedalar...");
		
	}

	@Override
	public void pararPedalar() {
		System.out.println("Parou de pedalar...");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void pararNadar() {
		System.out.println("Parou de nadar...");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
		
	}

	@Override
	public void pararCorrer() {
		System.out.println("Parou de correr...");
		
	}



}
