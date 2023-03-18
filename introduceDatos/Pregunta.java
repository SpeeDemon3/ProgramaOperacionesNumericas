package actividad03.introduceDatos;

import java.util.Scanner;

/*
 * Antonio Ruiz Benito DAW
 */

public class Pregunta {

	// Creo la funcion pidoEntero de tipo int para que pueda devolver el valor que introduzca el usuario
	public static int pideEntero(String pregunta) {
		// Utilizo la clase Scanner para guardar el valor introducido por el usuario
		Scanner sc = new Scanner(System.in);
		// Creo una variable de tipo int para recoger el valor del usuario
		int usuario = 0;
		// Creo una variable booleana para controlar el bucle do while
		boolean control = false;
		
		// Con un bucle Do WHILE controlo que el bucle no finalize mientras la variable control no sea true
		do {
			// Imprimo la pregunta
			System.out.println(pregunta);
			// Utilizo un condicional if else para controlar los valores introducidos por el usuario
			// Con el metodo hasNextInt() compruebo que el valor introducido por el usuario es de tipo entero
			if (sc.hasNextInt()) {
				// Si es de tipo entero lo guardo en la variable usuario
				usuario = sc.nextInt();
				// Cambio el valor de la variable control a true para salir del bucle
				control = true;				
			} else {
				// Si el usuario mete un valor erroneo le muestro un mensaje por consola indicandoselo
				System.out.println("El valor introducido no es correcto, por favor vuelva a intentarlo.");
				// Con next() descarto el valor, si no es un numero entero
				sc.next();
			}
			
		} while(control != true); // Mientras la variable control no sea true continua el bucle

		// Devuelvo el valor introducido por el usuario con return
		return usuario;

	}
	
	// Creo la funcion pideEntero de tipo double que recibe como parametro una pregunta y devuelve el valor que introduzca el usuario
	public static double pideDouble (String pregunta) {
		// Utilizo la clase Scanner para guardar el valor introducido por el usuario
		Scanner sc = new Scanner(System.in);
		// Creo una variable de tipo double para recoger el valor del usuario
		double usuario = 0.0;
		// Creo una variable de tipo boolean para controlar el bucle do while como condicion
		boolean control = false;
		
		do {
			// Imprimo la pregunta por consola
			System.out.println(pregunta);
			// Utilizo un condicional if else para controlar que los valores introducidos por el usuario sean de tipo double
			// Con el metodo hasNextDouble() compruebo que el valor introducido es de tipo double
			if (sc.hasNextDouble()) {
				// Si el valor es de tipo double lo guardo en la variable usuario
				usuario = sc.nextDouble();
				// Cambio el valor de la variable control a true para poder salir del bucle
				control = true;
			} else {
				// Si el usuario mete un valor erroneo le muestro un mensaje por consola indicandoselo
				System.out.println("El valor introducido no es correcto, por favor vuelva a intentarlo.");
				// Con next() descarto el valor, si no es un numero decimal
				sc.next();
			}
			
			
		} while (control != true); // Mientras la variable control no sea true continua el bucle
		
		// Devuelvo el valor introducido por el usuario con return
		return usuario;
		
	}

	
}
