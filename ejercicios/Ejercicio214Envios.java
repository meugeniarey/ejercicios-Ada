package ejercicios;

import java.util.Scanner;

public class Ejercicio214Envios {
	private static final float PESO_MAXIMO = 5000f;
	private static final int CostoZona1 = 11;
	private static final float CostoZona2 = 10;
	private static final float CostoZona3 = 12;
	private static final float CostoZona4 = 24;
	private static final float CostoZona5 = 27;

	public static void main(String[] args) {

		// 5 zonas de envio
		// max de envio, 5mil gramos
		// determinar costo total de entrega del paquete
		// determinar si se rechaza el envio

		// solicitar peso del paquete
		// solicitar zona

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese peso de envío en gramos");
		float peso = sc.nextInt();

		float pesoTotal = PESO_MAXIMO;

		if (peso > 0 && peso <= PESO_MAXIMO) {
			System.out.println("Ingrese número de zona");
			int zona = sc.nextInt();

			float costoTotal = 0;
			switch (zona) {
			case 1:
				costoTotal = peso * CostoZona1;
				break;

			case 2:
				costoTotal = peso * CostoZona2;
				break;

			case 3:
				costoTotal = peso * CostoZona3;
				break;

			case 4:
				costoTotal = peso * CostoZona4;
				break;

			case 5:
				costoTotal = peso * CostoZona5;
				break;

			default:
				System.out.println("Zona incorrecta");
			}
			System.out.println("El costo total de envío es:" + costoTotal);

		} else {
			System.out.println("No es posible realizar envío");
		}

		sc.close();

	}

}
