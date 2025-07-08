package encapsulamento;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	public double calcularArea() {
		return this.altura*this.base;
	}
	
	public double calcularPerimetro() {
		return (this.altura + this.base) * 2;
	}
}
