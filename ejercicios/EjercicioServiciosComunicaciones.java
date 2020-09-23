package ejercicios;

import java.util.Scanner;

public class EjercicioServiciosComunicaciones {
	// Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv
	// digital. Cada uno de los servicios tiene un precio diferente.
	// Se desea contar cuántos clientes optan por cada servicio para luego conocer
	// la facturación de cada uno de los servicios. Se deben ingresar los
	// clientes por número (cliente = 0 para finalizar)

	private static final int CANT_SERVICIOS = 3;

	static int numeroCliente;
	static int numeroServicio;

	static int clientesXServicio[] = new int[CANT_SERVICIOS];
	static float precioXServicio[] = new float[CANT_SERVICIOS];
	static float facturacionXServicio[] = new float[CANT_SERVICIOS];

	public static void main(String[] args) {

		for (int i = 0; i < CANT_SERVICIOS; i++) {
			clientesXServicio[i] = 0;
			precioXServicio[i] = 0;
			facturacionXServicio[i] = 0;
		}

		System.out.println("BienvenidX");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < CANT_SERVICIOS; i++) {
			System.out.println("Ingrece precio del servicio " + (i + 1));
			precioXServicio[i] = sc.nextFloat();
			System.out.println("El precio del servicio " + (i + 1) + " es " + precioXServicio[i]);
		}
		System.out.println("Ingrese número de cliente (0 = terminar)");
		numeroCliente = sc.nextInt();

		while (numeroCliente != 0) {
			System.out.println("Ingrese número de servicio (1= telefonía, 2= banda ancha, 3= TV digital)");
			numeroServicio = sc.nextInt();

			if (numeroServicio < 0 || numeroServicio > CANT_SERVICIOS) {
				System.out
						.println("Servicio inexistente. Vuelva a ingresar el número se servicio (valores del 1 al 3)");
			} else {
				clientesXServicio[numeroServicio - 1] = clientesXServicio[numeroServicio - 1] + 1;
			}
			System.out.println("Ingrese número de cliente (0 = terminar)");
			numeroCliente = sc.nextInt();
		}

		System.out.println("Cantidad de clientes por servicio: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < CANT_SERVICIOS; i++) {
			System.out.println("Servicio " + (i + 1) + ":" + clientesXServicio[i]);
		}

		System.out.println("Facturación por servicio: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < CANT_SERVICIOS; i++) {
			facturacionXServicio[i] = clientesXServicio[i] * precioXServicio[i];
			System.out.println("Servicio " + (i + 1) + ":" + facturacionXServicio[i]);
		}
	}

}
