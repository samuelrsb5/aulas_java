package metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos calculos = new CalcularMetodos();
		
		System.out.println(calculos.somar(2, 2));
		System.out.println(calculos.somar(2, 2, 2));
		
		
		System.out.println(calculos.subtrair(2, 2));
		System.out.println(calculos.subtrair(2, 2, 2));
		
		
		System.out.println(calculos.mult(2, 2));
		System.out.println(calculos.mult(2, 2, 2));
		
		
		System.out.println(calculos.div(2, 2));
		System.out.println(calculos.div(2, 2, 2));
		
		

	}

}
