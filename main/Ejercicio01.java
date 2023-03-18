package actividad03.main;

import java.util.Scanner;
import actividad03.introduceDatos.Pregunta;
import actividad03.operaciones.OperacionesLinkia;
import actividad03.operaciones.Valores;
import actividad03.operaciones.aritmeticas.Operaciones;

/*
 * Antonio Ruiz Benito DAW
 */

public class Ejercicio01 {
	
	public static void main (String[] args) {
				
		// Utilizo la clase Scanner para interactuar con el usuario
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que seleccione una opcion
		System.out.println("Bienvenido, selecione la operación que desea realizar:");

		// Creo la variable control para utilizarla como condicional en el bucle do while
		boolean control = false;
		
		
		
		// Con un bucle do while controlo que el menu se vuelva a mostrar mientras el usuario no decida salir
		do {
			// Creo el menu para interactuar con el usuario con las opciones posibles
			System.out.println("1 - Introduce un número decilmal para saber el resultado de multiplicarlo por 1,5.");
			System.out.println("2 - Conocer el valor del número PI.");
			System.out.println("3 - Introduce un número para conocer su valor absoluto.");
			System.out.println("4 - Introduce un número para recibir un número aleatorio entre el 0 y tu número");
			System.out.println("5 - Introduce un número decimal para conocer su logaritmo en base E.");
			System.out.println("6 - Calcular la potencia de un número.");
			System.out.println("7 - Conocer el seno de un número decimal.");
			System.out.println("8 - Conocer el coseno de un número decimal.");
			System.out.println("0 - Finalizar el programa.");
			
			try {
				// Creo la variable opcionUsuario para guardar la opcion escogida por el usuario
				// Utilizando la funcion pideEntero de la clase Pregunta paso por parametro la pregunta al usuario
				int opcionUsuario = Pregunta.pideEntero("Introduce una opción:");

				// Utilizo la variable opcionUsuario donde guardo la funcion pideEntero para pedir la opcion al usuario
				System.out.println("Has seleccionado la opción: " + opcionUsuario);
				
				
				
				// Con un switch controlo la opcion seleccionada por el usuario pasandole la variable opcionUsuario
				switch (opcionUsuario) {
					// Cuando el usuario seleccione el 0 finalizara el programa
					case 0:
						System.out.println("Fin del programa.");
						// Cambio la variable control a true para salir del bucle y finalizar el programa
						control = true;
					break;
				
					case 1:
						// Invoco a la funcion convertirLinkiaCoins() de la clase OperacionesLinkia
						OperacionesLinkia.convertirLinkiaCoins();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 2:
						// Invoco a la funcion muestraPI() de la clase Valores
						Valores.muestraPI();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 3:
						// Invoco a la funcion muestraValorAbsoluto() de la clase Valores
						Valores.muestraValorAbsoluto();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 4:
						// Invoco a la funcion muestraValorAleatorio() de la clase Valores
						Valores.muestraValorAleatorio();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 5:
						// Creo la variable valorUsuario para guardar y utilizar el metodo pideDouble, pidiendo y guardando 
						// el valor introducido por el usuario
						double valorUsuario = Pregunta.pideDouble("Introduce un valor decimal");
						// Invoco a la funcion muestraLogaritmo() pasando le como parametro el valor introducido por el usuario
						Operaciones.muestraLogaritmo(valorUsuario);
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 6:
						// Guardo en la variable valorUsuarioBase el numero que desea elevar el usuario utilizando el metodo pideDouble
						double valorUsuarioBase = Pregunta.pideDouble("Introduce el número que deseas elevar:");
						// Guardo en la variable valorUsuarioExponente el numero de veces que lo desea elevar con el metodo pideDouble
						double valorUsuarioExponente = Pregunta.pideDouble("Introduce el número de veces que deseas elevarlo:");
						// Invoco al metodo calculaPotencia() pasandole las 2 variables que contienen los valores introducidos por el usuario
						Operaciones.calculaPotencia(valorUsuarioBase, valorUsuarioExponente);
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 7:
						// Invoco a la funcion muestraSeno() de la clase Operaciones del subpackage geometricas
						actividad03.operaciones.geometricas.Operaciones.muestraSeno();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					case 8:
						// Invoco a la funcion muestraCoseno() de la clase Operaciones del subpackage geometricas
						actividad03.operaciones.geometricas.Operaciones.muestraCoseno();
						// Añado un salto de linea
						System.out.println("");
					break;
					
					// Si elige un valor fuera del rango muestro un mensaje al usuario
					default:
						System.out.println("La opción elegida no es valida.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("La opción elegida no es valida, debes introducir un valor numérico dentro del rango de opciones.");
			}
			
			
			
		} while(control != true); // Mientras la variable control no sea true el bucle seguira iterando
	
		System.out.println("Ejercicio realizado por Antonio Ruiz Benito.");
		
	}


}
