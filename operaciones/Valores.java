package actividad03.operaciones;

import actividad03.introduceDatos.*; // Importo el package introduceDatos para hacer uso de sus funciones

/*
 * Antonio Ruiz Benito DAW
 */
public class Valores {

	// Creo la funcion muestraPI de tipo void
	public static void muestraPI() {
		// Asigno a la variablde de tipo double el valor del numero PI con la clase Math
		double numPi = Math.PI;
		// Lo imprimo por consola
		System.out.println("El valor del número PI es: " + numPi);
	}
	
	// Creo la funcion muestraValorAbsoluto()
	public static void muestraValorAbsoluto() {
		// Guardo dentro de la variable valorUsuario la funcion pideDouble para guardar el valor introducido
		double valorUsuario = Pregunta.pideDouble("Introduce un valor decimal:");
		// Guardo en la variable valorAbsolutoUsuario la variable valorUsuario pasada a valor absoluto con Math.abs()
		double valorAbsolutoUsuario = Math.abs(valorUsuario);
		// Muestro por consola un mensaje con el valor del usuario y su valor absoluto
		System.out.println("El valor absoluto de " + valorUsuario + " es " + valorAbsolutoUsuario);
		
	}
	
	// Creo la funcion muestraValorAleatorio
	public static void muestraValorAleatorio() {
		
		// Meto en una variable el metodo random() de la clase Math para generar un numero aleatorio entre 0.0 y 1.0 (no estando incluido 1.0)
		double numeroAleatorio = Math.random();
		// Guardo en la variable valorUsuario el metodo pideEntero() pasandole por parametro el texto y recogiendo el valor pasado por el usuario 
		int valorUsuario = Pregunta.pideEntero("Introduce un número");
		// Convierto con una conversion explicita a tipo int  el valor de multiplicar las 2 variables perdiendo lo de detras de la coma del decimal
		int aleatorioEntero = (int) (numeroAleatorio  * valorUsuario); // Multiplico los valores para generar el numero aleatorio
		// Muestro por consola un mensaje al usuario con el valor introducido y el numero aleatorio
		System.out.println("El número aleatorio entre 0 " + " y " + valorUsuario + " es " + aleatorioEntero);
		
	}
	
}
