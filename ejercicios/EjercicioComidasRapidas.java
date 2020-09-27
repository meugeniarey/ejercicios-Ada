package ejercicios;

import java.util.Scanner;

public class EjercicioComidasRapidas {
	// Una cadena de venta de comidas rápidas ofrece cuatro combos diferentes.
	// Se debe ingresar el valor de cada combo para tener los precios de venta.
	// Luego, a medida que llegan los clientes, debemos contar la cantidad de
	// combos que se vendió de cada uno y el total recaudado.

	private static final int TOTAL_COMBOS = 4;
	private static float total = 0f;
	private static int contador = 0;

	public static void main(String[] args) {
		// inicializar valores
		// ingresar precios
		// generar ventas
		// mostrar ventas

		float combos[] = ingresarPrecios();

		float total = realizarVentas(combos);

		mostrarResultados(total, contador);

	}

	private static float[] ingresarPrecios() {
		float combos[] = new float[TOTAL_COMBOS];
		for (int i = 0; i < combos.length; i++) {
			combos[i] = 0;
		}
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < combos.length; i++) {
			System.out.println("Ingrese el precio de venta del combo " + (i + 1));
			combos[i] = sc.nextFloat();
		}
		sc.close();

		for (int j = 0; j < combos.length; j++) {
			System.out.println("El precio de venta del combo " + (j + 1) + " es de " + combos[j]);
		}

		return combos;
	}

	private static float realizarVentas(float[] combos) {
		int seleccionCombo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el número de combo que desea comprar (0=terminar)");
		seleccionCombo = sc.nextInt();

		while (seleccionCombo != 0) {
			if (seleccionCombo < 0 || seleccionCombo > 4) {
				System.out.println("Seleccion invalida. Elija un número de combo del 1 al 4");
			} else {
				total += combos[seleccionCombo - 1];
				contador++;
			}

			System.out.println("Ingrese el número de combo que desea comprar (0=terminar)");
			seleccionCombo = sc.nextInt();
		}

		sc.close();
		return total;
	}

	private static void mostrarResultados(float total, int contador) {
		System.out.println("Cantidad de combos que se vendieron: " + contador);
		System.out.println("Total recaudado: " + total);

	}
}
