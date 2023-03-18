package actividad03.operaciones.geometricas;

import actividad03.introduceDatos.Pregunta; // Importo la clase Pregunta para poder utilizar sus funciones

/*
 * Antonio Ruiz Benito DAW
 */
public class Operaciones {
	
	// Creo la funcion muestraSeno de tipo void 
	public static void muestraSeno() {
		// Creo la variable valorUsuario donde guardare el valor introducido por el usuario, utilizando la funcion pideDouble()
		// muestro un mensaje al usuario y guardo el valor que introduzca
		double valorUsuario = Pregunta.pideDouble("Introduce un número decimal:");
		// Creo la variable seno para sacar el seno del valor de la variable usuario usando el metodo .sin() de la clase Math
		double seno = Math.sin(valorUsuario);
		// Imprimo por consola un texto indicandole el valor introducido por el usuario y el valor de su seno
		System.out.println("El seno de " + valorUsuario + " es " + seno);
		
	}
	
	// Creo la funcion muestraCoseno de tipo void
	public static void muestraCoseno() {
		// Creo la variable valorUsuario de tipo double donde introduzco la funcion pideDouble() de la clase Pregunta
		// para mostrar un texto al usuario y guardar el valor que introduzca
		double valorUsuario = Pregunta.pideDouble("Introduce un número decimal:");
		// Creo la variable coseno de tipo double donde guardo el metodo .cos() de la clase Math al que introduzco la variable valorUsuario
		// para que me de el coseno del valor introducido por el usuario
		double coseno = Math.cos(valorUsuario);
		// Imprimo por consola un mensaje con el valor introducido por el usuario y su coseno
		System.out.println("El coseno de " + valorUsuario + " es " + coseno);
	}

}
