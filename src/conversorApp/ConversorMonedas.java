package conversorApp;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	/**
	 * Muestra el menu del conversor de moneda, ejecuta la conversion y muestra el
	 * resultado
	 */
	public ConversorMonedas() {

		String opcion = mostrarMenu();
		String[] monedas = {"pesos","dolares","euros","libras","yenes","wones"};

		switch (opcion) {
		case "Pesos a Dolares": {
			ConvertirFuncion.convertirMoneda(monedas[0], monedas[1], 550);
			break;
		}
		case "Dolares a Pesos": {
			ConvertirFuncion.convertirMoneda(monedas[1], monedas[0], 550);
			break;
		}
		case "Pesos a Euros": {
			ConvertirFuncion.convertirMoneda(monedas[0], monedas[2], 5900);
			break;
		}
		case "Euros a Pesos": {
			ConvertirFuncion.convertirMoneda(monedas[2], monedas[0], 590);
			break;
		}
		case "Pesos a Libras": {
			ConvertirFuncion.convertirMoneda(monedas[0], monedas[3], 671);
			break;
		}
		case "Libras a Pesos": {
			ConvertirFuncion.convertirMoneda(monedas[3], monedas[0], 671);
			break;
		}
		case "Pesos a Yen": {
			ConvertirFuncion.convertirMoneda(monedas[0], monedas[4], 346);
			break;
		}
		case "Yen a Pesos": {
			ConvertirFuncion.convertirMoneda(monedas[4], monedas[0], 346);
			break;
		}
		case "Pesos a Won": {
			ConvertirFuncion.convertirMoneda(monedas[0], monedas[5], 2.28);
			break;
		}
		case "Won a Pesos": {
			ConvertirFuncion.convertirMoneda(monedas[5], monedas[0], 2.28);
			break;
		}
		default:
			break;
		}

	}

	/**
	 * Muestra el menu y devuelve la opcion seleccionada
	 * 
	 * @return opcion seleccionada
	 */
	public static String mostrarMenu() {
		
		String opcion="";
		
		try {
		opcion = (JOptionPane.showInputDialog(null, "Elija la conversion que desea realizar:",
				"Conversor de monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Pesos a Dolares", "Dolares a Pesos", "Pesos a Euros", "Euros a Pesos", "Pesos a Libras",
						"Libras a Pesos", "Pesos a Yen", "Yen a Pesos", "Pesos a Won", "Won a Pesos" },
				"Seleccion")).toString();
		} catch (NullPointerException e) {
			
		};

		return opcion;
	}

}
