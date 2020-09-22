package ejercicios;

import java.util.Scanner;

public class EjercicioServiciosComunicacionesMariu {
	// Una empresa de comunicaciones ofrece servicio de telefon�a, banda ancha y tv
	// digital. Cada uno de los servicios tiene un precio diferente.
	// Se desea contar cu�ntos clientes optan por cada servicio para luego conocer
	// la facturaci�n de cada uno de los servicios. Se deben ingresar los
	// clientes por n�mero (cliente = 0 para finalizar)

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
		System.out.println("Ingrese n�mero de cliente (0 = terminar)");
		numeroCliente = sc.nextInt();

		while (numeroCliente != 0) {
			System.out.println("Ingrese n�mero de servicio (1= telefon�a, 2= banda ancha, 3= TV digital)");
			numeroServicio = sc.nextInt();

			if (numeroServicio < 0 || numeroServicio > CANT_SERVICIOS) {
				System.out
						.println("Servicio inexistente. Vuelva a ingresar el n�mero se servicio (valores del 1 al 3)");
			} else {
				clientesXServicio[numeroServicio - 1] = clientesXServicio[numeroServicio - 1] + 1;
			}
			System.out.println("Ingrese n�mero de cliente (0 = terminar)");
			numeroCliente = sc.nextInt();
		}

		System.out.println("Cantidad de clientes por servicio: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < CANT_SERVICIOS; i++) {
			System.out.println("Servicio " + (i + 1) + ":" + clientesXServicio[i]);
		}

		System.out.println("Facturaci�n por servicio: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < CANT_SERVICIOS; i++) {
			facturacionXServicio[i] = clientesXServicio[i] * precioXServicio[i];
			System.out.println("Servicio " + (i + 1) + ":" + facturacionXServicio[i]);
		}
	}

}
