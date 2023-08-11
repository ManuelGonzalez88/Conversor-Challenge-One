package ejecucionEnConsola;
import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {

		Scanner ingresarDato = new Scanner(System.in);

		int opcion;

		do {

			System.out.println();
			Conversor.mostrarMenu();
			opcion = ingresarDato.nextInt();
			System.out.println();

			switch (opcion) {
			case 1: {
				Conversor.convertir("pesos", "dolares", 550, ingresarDato);
				break;
			}
			case 2: {
				Conversor.convertir("dolares", "pesos", 550, ingresarDato);
				break;
			}
			case 3: {
				Conversor.convertir("pesos", "euros", 590, ingresarDato);
				break;
			}
			case 4: {
				Conversor.convertir("euros", "pesos", 590, ingresarDato);
				break;
			}
			case 5: {
				System.out.println("Fin del programa");
				break;
			}
			default: {
				System.out.println("Opcion incorrecta intente nuevamente");
			}
			}

		} while (opcion != 5);
		
		ingresarDato.close();

	}

}
