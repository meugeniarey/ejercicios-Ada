package ejercicios;

import java.util.Scanner;

public class EjercicioMenuLista {
	// Ejercicio :
//	Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes, 
//	donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
//	Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
//	Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese 
// cero para salir. (1. agregar  2. listar 3. modificar 0. salir)

	private static final int CANT_DIAS = 5;

	public static void main(String[] args) {

		mostrarBienvenida();

		int seleccion;
		String modificar;
		float recaudacion[] = new float[CANT_DIAS];
		float total;

		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione operación a realizar (1. agregar  2. listar 3. modificar 0. salir");

	}

	private static void mostrarBienvenida() {
		System.out.println("BienvenidX ! ");

	}

}
