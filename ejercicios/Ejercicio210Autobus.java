package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobus {
	private static final int MINIMO_PERSONAS = 20;
	private static final int COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final int COSTO_C = 3;
	private static final String BUS_A = "A";
	private static final String BUS_B = "B";
	private static final String BUS_C = "C";

	public static void main(String[] args) {

		// 3 costos diferentes
		// min 20 personas
		// det el costo total
		// det costo por personas

		// solicitar la cant de personas
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de personas");
		int personas = sc.nextInt();

		// solicitar la cant de km
		System.out.println("Ingrese cantidad de km");
		int km = sc.nextInt();

		// solicitar el tipo de autobus
		System.out.println("Ingrese tipo de autobus A, B o C");
		String tipo = sc.next();

		System.out.println("Ingreso: " + personas);
		System.out.println("Ingreso: " + km);
		System.out.println("Ingreso: " + tipo);

		int totalPersonas = MINIMO_PERSONAS;
		// calcular el costo del transporte
		if (personas > MINIMO_PERSONAS) {
			totalPersonas = personas;
		}

		// calc costo tot:
		// tot personas * km * precio del boleto

		int costoTotal = totalPersonas * km;
		// hago un system.out p mostrar que sale hasta ahora, porque no estaba dando30
		System.out.println("Costo total " + costoTotal);
		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case BUS_A:
			totalGrupal = costoTotal * COSTO_A;
			break;

		case BUS_B:
			totalGrupal = costoTotal * COSTO_B;
			break;
		case BUS_C:
			totalGrupal = costoTotal * COSTO_C;
			break;

		}
		System.out.println("El total grupal es:" + totalGrupal);
		sc.close();

	}

}
