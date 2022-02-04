package metodos;

public class Metodos {
	//Metodos es una funcion
	
	//atributos de la clase
	int a, b;
	
	//Metodos void = vacio
	//Es un metodo que no va devolver nada
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("La suma de " + a + " + " + b + " = " + resultado);
		
	}
	
	//Metodo con retorno de valores
	
	public int sumaConRetorno() {
		//int resultado = a + b;
		// return resultado;
		return a + b;
	}
	
	//argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		// para los argumentos deben ser de mismo tipo que el public
		// si lo subes de nivel a double, uno arg al menos debe ser de tipo double
		
		int c = arg1;
		double d = arg2;
		return c * d;
		
	}
	
	
	// Metodo estatico
	// este metodo pertenece a la clase
	// no necesita de un objeto para ser invocado
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
	
	
	
	
}
