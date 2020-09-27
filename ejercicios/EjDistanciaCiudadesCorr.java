package ejercicios;

import java.util.Scanner;

public class EjDistanciaCiudadesCorr {

	//
	// En un trayecto entre dos ciudades se deben realizar paradas intermedias.
	// Se desea conocer cuantas paradas
	// se van a realizar en el viaje y la longitud de los trayectos en kilometros.
	// Se desea conocer la longitud
	// promedio entre ciudades y
	// cuales son las paradas mas cercanas

	// inicio
	// *------- * ---------------- * ----- * ----------- *
//	      40            100            15      60

	public static void main(String[] args) {

		System.out.println("Bienvenido");

		int parada[] = hacerProceso();

		for (int j = 0; j < parada.length + 1; j++) {
			dibujarTrayecto(parada[j]);

		}
	}

	private static int[] hacerProceso() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de paradas intermedias entre ciudades");
		int cantParadas = sc.nextInt();
		int parada[] = new int[cantParadas + 1];
		int totalKm = 0;
		float promedio = 0f;

		for (int i = 0; i < parada.length; i++) {
			System.out.println("Ingrese cantidad de km a recorrer entre la parada " + i + " y la parada  " + (i + 1));
			parada[i] = sc.nextInt();
			totalKm = totalKm + parada[i];
			promedio = totalKm / cantParadas;

		}
		System.out.println("La longitud recorrida es de " + totalKm);
		System.out.println("La distancia promedio entre paradas fue de " + promedio);

		sc.close();

		System.out.print("*");
		return parada;
	}

	private static void dibujarTrayecto(int distancia) {
		for (int i = 0; i < distancia; i++) {
			System.out.print("-");

		}
		// TODO Auto-generated method stub
		System.out.print("*");
	}

}
