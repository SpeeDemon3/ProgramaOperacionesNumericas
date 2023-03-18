package actividad03.operaciones;

import actividad03.introduceDatos.Pregunta;
/*
 * Antonio Ruiz Benito DAW
 */
public class OperacionesLinkia {
	
	// Creo la funcion convertirLinkiaCoins() de tipo void, no retorna nada, imprimira el resultado de la operacion por pantalla
	public static void convertirLinkiaCoins() {
		// Meto la funcion pideDouble dentro de una variable pasandole por parametro el texto
		double valor = Pregunta.pideDouble("Introduce el valor decimal");
		// Creo la variable multiplicador para asignarle el valor de 1,5
		double multiplicador = 1.5;
		// Guardo dentro de la variable resultado la operacion 
		double resultado = valor * multiplicador;
		// Imprimo por consola los valores y el resultado
		System.out.println("El valor de multiplicar " + valor + " x " + multiplicador + " = " + resultado);
		
	}
	
}
