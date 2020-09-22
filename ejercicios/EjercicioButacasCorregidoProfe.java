package ejercicios;

import java.util.Scanner;

//Se venden boletos de una funcion numerados del 0-49. 
//Cada uno de esos boletos se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo 
//con un valor 1 hasta que se ingrese asiento numero 99
//Listar los asientos vendidos
public class EjercicioButacasCorregidoProfe {
	private static final int TOTAL_BUTACAS = 50;

	public static void main(String[] args) {

		int butacas[] = new int[TOTAL_BUTACAS];
		for (int i = 0; i < TOTAL_BUTACAS; i++) {
			butacas[i] = 0;
		}

		int numeroAsiento;

		mostrarMensajeBienvenidx();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese número de asiento a comprar (99=salir)");
		numeroAsiento = sc.nextInt();

		while (numeroAsiento != 99) {
			// Agregado:
			// numeroAsiento 0 - 9 -> Informar costo 100
			// numeroAsiento 10 -19 -> Informar costo 80
			// numeroAsiento 20 - 29 -> Informar costo 60
			// numeroAsiento 30 - 39 -> Informar costo 40
			// numeroAsiento 40 - 49 -> Informar costo 20

			switch (numeroAsiento / 10) {
			case 0:
				System.out.println("Costo $100");
				break;
			case 1:
				System.out.println("Costo $80");
				break;
			case 2:
				System.out.println("Costo $60");
				break;
			case 3:
				System.out.println("Costo $40");
				break;
			case 4:
				System.out.println("Costo $20");
				break;
			}

			if (numeroAsiento < 0 || numeroAsiento > TOTAL_BUTACAS - 1) {
				System.out.println("Butaca inexistente");
			} else {
				System.out.println("Butaca" + numeroAsiento + "=" + butacas[numeroAsiento]);
				if (butacas[numeroAsiento] == 0) {
					butacas[numeroAsiento] = 1;
					System.out.println("Venta confirmada");
				} else {
					System.out.println("Butaca vendida, seleccione otra");
				}
			}
			System.out.println("Ingrese número de asiento a comprar (99=salir)");
			numeroAsiento = sc.nextInt();
		}
		sc.close();
		int contador = 0;
		System.out.println("Mostrar butacas vendidas");

		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 1) {
				System.out.println("Butaca " + i);
				contador++;
			}
		}
		System.out.println("Butacas vendidas: " + contador);
		dibujarButacas(butacas);

	}

	private static void mostrarMensajeBienvenidx() {
		System.out.println("Bienvenidx");

	}

	private static void dibujarButacas(int[] butacas) {
		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 0) {
				System.out.print(" _ ");
			} else {
				System.out.print(" X ");
			}
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}

	}

}
