package conversorApp;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirFuncion {

	/**
	 * 
	 * @param valorEntrada
	 * @param valorSalida
	 * @param valorMoneda  valor de moneda con respecto al peso
	 */
	public static void convertirMoneda(String valorEntrada, String valorSalida, double valorMoneda) {
		
		double cantidad = 0;
		double cantidadConvertida;
		boolean cancelar = false;

		try {
			cantidad = ingresarNumeros(valorEntrada, valorSalida);
		} catch (NullPointerException e) { // si se presiona cancelar en el ingreso de datos
			cancelar = true;
			JOptionPane.showMessageDialog(null, "Seleccionaste cancelar.");
		}

		if (!cancelar) { // si se presionó cancelar se deja de ejecutar esta seccion
			if (valorEntrada == "pesos") {
				cantidadConvertida = cantidad / valorMoneda;
			} else {
				cantidadConvertida = cantidad * valorMoneda;
			}

			JOptionPane.showMessageDialog(null, "La cantidad de '" + cantidad + "' " + valorEntrada + " son '"
					+ redondear(cantidadConvertida) + "' " + valorSalida);

		}

	}

	public static void convertirTemperatura(String valorEntrada, String valorSalida) {

		double cantidad = 0;
		double cantidadConvertida = 0;
		boolean cancelar = false;

		try {
			cantidad = ingresarNumeros(valorEntrada, valorSalida);
		} catch (NullPointerException e) { // si se presiona cancelar en el ingreso de datos
			cancelar = true;
			JOptionPane.showMessageDialog(null, "Seleccionaste cancelar.");
		}

		if (!cancelar) { // si se presionó cancelar se deja de ejecutar esta seccion

			switch (valorEntrada) {
			case "grados celsius": {
				
				switch (valorSalida) {
				case "grados fahrenheit": {
					cantidadConvertida = (cantidad * 9 / 5) + 32;
					break;
				}
				case "grados kelvin": {
					cantidadConvertida = cantidad + 273.15;
					break;
				}
				}
				
				break;
			}
			case "grados fahrenheit": {
				switch (valorSalida) {
				case "grados celsius": {
					cantidadConvertida = (cantidad-32)*5/9;
					break;
				}
				case "grados kelvin": {
					 cantidadConvertida = (cantidad - 32) * 5/9 + 273.15;
					break;
				}
				}
				
				break;
			}
			case "grados kelvin": {
				switch (valorSalida) {
				case "grados celsius": {
					cantidadConvertida = cantidad - 273.15;
					break;
				}
				case "grados fahrenheit": {
					cantidadConvertida = ( cantidad - 273.15) * 1.8  + 32;
					break;
				}
				}
				
				break;
			}

			}

			JOptionPane.showMessageDialog(null, "La cantidad de '" + cantidad + "' " + valorEntrada + " son '"
					+ redondear(cantidadConvertida) + "' " + valorSalida);

		}

	}

	/**
	 * se pide ingresar la cantidad y valida que sean numeros, con mensaje de
	 * convertir
	 * 
	 * @param valorEntrada
	 * @param valorSalida
	 * @return
	 */
	public static double ingresarNumeros(String valorEntrada, String valorSalida) {

		double numeros = 0;
		boolean numeroValido;

		do {

			try { // se valida que se ingresen numeros

				numeros = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Ingrese la cantidad de " + valorEntrada + " para convertir a " + valorSalida));
				numeroValido = true;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida.");
				numeroValido = false;
			}

		} while (!numeroValido);

		return numeros;

	}
	
	private static String redondear(double valor) {  
		DecimalFormat df = new DecimalFormat("0.00");  
		df.setRoundingMode(RoundingMode.HALF_UP);  
		return df.format(valor);
		}

}
