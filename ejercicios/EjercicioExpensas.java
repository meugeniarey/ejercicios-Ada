package ejercicios;

import java.util.Scanner;

public class EjercicioExpensas {
	// Se desea calcular el total de expensas a pagar de un edificio de
	// 4 pisos que tiene un departamento por piso desde planta baja hasta
	// el último piso. Se deben ingresar los valores de cada departamento
	// y luego informar el importe de expensas promedio

	// inicializar valores.
	// ingresar expensas por piso
	// calcular total
	// calculas promedio
	// mostrar resultados

	private static final int TOTAL_PISOS = 5;
	private static float promedio = 0f;
	private static float total = 0f;

	public static void main(String[] args) {
		int expensasXPiso[] = inicializarValores();

		float total = calcularTotales(expensasXPiso);

		mostrarInfo(total, expensasXPiso, promedio);
	}

	private static int[] inicializarValores() {
		int expensasXPiso[] = new int[TOTAL_PISOS];
		for (int i = 0; i < TOTAL_PISOS; i++) {
			expensasXPiso[i] = 0;

		}
		return expensasXPiso;
	}

	private static float calcularTotales(int[] expensasXPiso) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < TOTAL_PISOS; i++) {
			System.out.println("Ingrese el valor a pagar en expensas por el departamento " + i);
			expensasXPiso[i] = sc.nextInt();
			total = total + expensasXPiso[i];
		}

		sc.close();
		promedio = total / TOTAL_PISOS;
		return total;
	}

	private static void mostrarInfo(float total, int[] expensasXPiso, float promedio) {
		for (int i = 0; i < TOTAL_PISOS; i++) {
			System.out.println("El valor de expensas pagado por el departamento " + i + " fue de " + expensasXPiso[i]);
		}
		System.out.println("El total de expensas fue de: " + total);
		System.out.println("El valor de expensas promedio pagado fue de: " + promedio);

	}

}
