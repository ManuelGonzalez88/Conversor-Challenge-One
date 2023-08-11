package ejecucionEnConsola;
import java.util.Scanner;

public class Conversor {

	public static void mostrarMenu() {

		System.out.println("----------------------");
		System.out.println("Menu");
		System.out.println();
		System.out.println("1.Peso a Dolar");
		System.out.println("2.Dolar a Peso");
		System.out.println("3.Peso a Euro");
		System.out.println("4.Euro a Peso");
		System.out.println("5.Salir");
		System.out.println();
		System.out.println("----------------------");
		System.out.print("Ingrese opcion:");

	}

	public static void convertir(String monedaEntrada, String monedaSalida, double valorMoneda, Scanner entrada) {
		
		System.out.println("Ingrese la cantidad de " + monedaEntrada + " para convertir a " + monedaSalida);
		double cantidad = entrada.nextDouble();
		double cantidadConvertida;
		
		if (monedaEntrada == "pesos") {
			cantidadConvertida = cantidad / valorMoneda;
		} else {
			cantidadConvertida = cantidad * valorMoneda;
		}
		
		System.out.println("La cantidad de " + monedaSalida + " es: " + cantidadConvertida);
		
	}

}
