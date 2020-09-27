package ejercicios;

import java.util.Scanner;

public class Ejercicio203Lapices {
	private static final int PRECIO_MAYORISTA = 85;
	private static final int PRECIO_MINORISTA = 90;

	public static void main(String[] args) {
		// de 1000 en adelante precio 85
		// sino precio 90
		// solicitar cantidad de lapices
		// informar el total

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de lápices a comprar");
		int lapices = sc.nextInt();

		int costoTotal = 0;

		if (lapices < 1000) {
			costoTotal = lapices * PRECIO_MINORISTA;
		} else {
			costoTotal = lapices * PRECIO_MAYORISTA;
		}
		System.out.println("El precio total a pagar es:" + costoTotal);
		sc.close();
	}
}
