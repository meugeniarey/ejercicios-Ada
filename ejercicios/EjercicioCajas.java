package ejercicios;

import java.util.Scanner;

public class EjercicioCajas {

	static float totalFacturas = 0f;
	static int cantidadFacturas = 0;

	// Ejercicio:
	// Se tiene una linea de 4 cajas donde se cobran facturas
	// que luego seran cargadas en el sistema.
	// Se solicitara el numero de caja y el importe cobrado.
	// La carga finaliza con importe cero.
	// Informar la cantidad de facturas cobradas por cada caja
	// y el promedio de todas las facturas

	public static void main(String[] args) {

		int numCajas[] = new int[4];
		for (int i = 0; i < numCajas.length; i++) {
			numCajas[i] = 0;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el importe de la factura (0=terminar)");
		float importe = sc.nextFloat();

		while (importe != 0) {
			System.out.println("Ingrese Numero de caja");
			int caja = sc.nextInt();
			numCajas[caja - 1] = numCajas[caja - 1] + 1;
			totalFacturas = totalFacturas + importe;

			System.out.println("Ingrese el importe de la factura (0=terminar)");
			importe = sc.nextFloat();
		}

		for (int i = 0; i < numCajas.length; i++) {
			System.out.println("Caja" + (i + 1) + ": " + numCajas[i]);
			cantidadFacturas = cantidadFacturas + numCajas[i];

		}

		System.out.println("Promedio" + totalFacturas / cantidadFacturas);

		sc.close();
	}
}
