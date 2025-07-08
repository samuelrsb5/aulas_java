package encapsulamento;

public class TestePets {

	public static void main(String[] args) {
	Pet p1 = new Pet();
	p1.setIdade(8000);
	p1.setNome("Aatrox");
	p1.setTipo("Darkin");
	p1.setRaca("Ascendente");
	
	System.out.println(p1.getIdade());
	System.out.println(p1.getNome());
	System.out.println(p1.getTipo());
	System.out.println(p1.getRaca());
	
	}

}
