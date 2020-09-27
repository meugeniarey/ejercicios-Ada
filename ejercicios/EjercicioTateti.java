package ejercicios;

import java.util.Scanner;

/*
 * Un tablero de 3 * 3 matriz [filas][columnas] 
 * dos jugadores que ingresen las coordenadas de cada ficha por teclado(le digo infrese ficha, ingrese columna)
 * una vez que tengo fila y columna, muestro  el tablero con fichas X o O
 * Verificar si es posible la posicion y ver si hay ganador
 */
public class EjercicioTateti {
	private static int FILAS = 3;
	private static int COLS = 3;

	public static void main(String[] args) {
		char[][] tablero = new char[FILAS][COLS];

		// MIENTRAS NO HAYA GANADOR
		boolean ganador = false;
		int contador = 1;
		int turno = 1;
		System.out.println("Juego TA-TE-TI");
		System.out.println();

		imprimir(tablero);
		while (!ganador && contador <= 9) {

			// JUGAR FICHA EN EL TABLERO
			// J1: PEDIR COORDENADAS
			// DIBUJAR EL TABLERO ACTUALIZADO
			// VERIFICAR SI HAY GANADOR

			// J2: PEDIR COORDENADAS
			// DIBUJAR TABLERO ACTUALIZADO
			// VERIFICAR SI HAY GANADOR

			// J1: PEDIR COORDENADAS
			// BUCLE

			contador++;
			turno = contador % 2;
			ganador = jugarFicha(turno, tablero);
		}

		if (contador >= 9) {
			System.out.println("Empataron!");
		}

	}

	private static boolean jugarFicha(int turno, char[][] tablero) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR " + (turno + 1) + " Ingrese fila (del 0 al 2): ");
		int fila = sc.nextInt();
		System.out.println("Ingrese columna (del 0 al 2): ");
		int columna = sc.nextInt();
		boolean ganador = false;

		while (columna < 0 || columna > 2 || fila < 0 || fila > 2) {
			System.out.println();
			System.out.println("Ubicación inválida");
			System.out.println("Ingrese nueva jugada");
			System.out.println();
			System.out.println("JUGADOR " + (turno + 1) + " Ingrese fila (del 0 al 2): ");
			fila = sc.nextInt();
			System.out.println("Ingrese columna (del 0 al 2): ");
			columna = sc.nextInt();

		}

		while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
			System.out.println();
			System.out.println("Ubicación inválida");
			System.out.println("Ingrese nueva jugada");
			System.out.println();
			System.out.println("JUGADOR " + (turno + 1) + " Ingrese fila (del 0 al 2): ");
			fila = sc.nextInt();
			System.out.println("Ingrese columna (del 0 al 2): ");
			columna = sc.nextInt();
		}

		if (turno == 0) {
			tablero[fila][columna] = 'X';
		} else {
			tablero[fila][columna] = 'O';
		}
		ganador = hayGanador(tablero);
		imprimir(tablero);
		if (ganador) {
			System.out.println("Ganaste!! Jugador " + (turno + 1));
		}
		return ganador;
	}

	private static boolean hayGanador(char[][] tablero) {
		boolean cond1 = tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond2 = tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]
				&& (tablero[1][0] == 'X' || tablero[1][0] == 'O');
		boolean cond3 = tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]
				&& (tablero[2][0] == 'X' || tablero[2][0] == 'O');

		boolean cond4 = tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond5 = tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]
				&& (tablero[0][1] == 'X' || tablero[0][1] == 'O');
		boolean cond6 = tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		boolean cond7 = tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond8 = tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		return cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8;

	}

	private static void imprimir(char[][] tablero) {
		System.out.println('[');
		for (int fila = 0; fila < FILAS; fila++) {
			for (int col = 0; col < COLS; col++) {
				System.out.print(" " + tablero[fila][col] + " ");
			}
			System.out.println(); // esto es p que desp de la linea hga un salto
		}
		System.out.println(']');
	}
}
