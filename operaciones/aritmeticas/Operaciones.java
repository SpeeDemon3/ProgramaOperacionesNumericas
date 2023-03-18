package actividad03.operaciones.aritmeticas;

/*
 * Antonio Ruiz Benito DAW
 */
public class Operaciones {

	// Creo la funcion muestraLogaritmo() pasandole como parametro una variable de tipo double 
	public static void muestraLogaritmo(double valor) {
		// Creo la variable logE de la clase double y dentro utilizando el metodo .log() de la clase Math paso como parametro la 
		// variable que contiene el valor introducido por el usuario y lo paso a logaritmo en base E
		double logE = Math.log(valor);
		// Imprimo por consola un texto con el valor introducido por el usuario y su logaritmo en base E
		System.out.println("El logaritmo en base E de " + valor + " es " + logE + ".");
		
	}
	
	// Creo la funcion calculaPotencia() pasandole como parametro 2 variables de tipo double para calcular la potencia del primer
	// valor introducido elevado al segundo valor introducido
	public static void calculaPotencia(double base, double exponente) {
		// Guardo en la variable potencia el resultado de elevar la primera variable al valor de la segunda
		// con el metodo .pow() de la clase Math saco la potencia pasandole las 2 variables
		double potencia = Math.pow(base, exponente);
		// Muestro por consola al usuario un texto con el valor de las 2 variables y el resultado de la potencia
		System.out.println("El número " + base + " elevado a " + exponente + " tiene como resultado: " + potencia + ".");
		
	}
	
}
