package conversorApp;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	/**
	 * Muestra el menu del conversor de moneda, ejecuta la conversion y muestra el
	 * resultado
	 */
	public ConversorTemperatura() {

		String opcion = mostrarMenu();

		switch (opcion) {
		case "Grados celsius a grados fahrenheit": {
			ConvertirFuncion.convertirTemperatura("grados celsius", "grados fahrenheit");
			break;
		}
		case "Grados celsius a grados kelvin": {
			ConvertirFuncion.convertirTemperatura("grados celsius", "grados kelvin");
			break;
		}
		case "Grados fahrenheit a grados celsius": {
			ConvertirFuncion.convertirTemperatura("grados fahrenheit", "grados celsius");
			break;
		}
		case "Grados fahrenheit a grados kelvin": {
			ConvertirFuncion.convertirTemperatura("grados fahrenheit", "grados kelvin");
			break;
		}
		case "Grados kelvin a grados celsius": {
			ConvertirFuncion.convertirTemperatura("grados kelvin", "grados celsius");
			break;
		}
		case "Grados kelvin a grados fahrenheit": {
			ConvertirFuncion.convertirTemperatura("grados kelvin", "grados fahrenheit");
			break;
		}
		}

	}

	/**
	 * Muestra el menu y devuelve la opcion seleccionada
	 * 
	 * @return opcion seleccionada
	 */
	public static String mostrarMenu() {

		String opcion = "";

		try {
			opcion = (JOptionPane.showInputDialog(null, "Elija la conversion que desea realizar:",
					"Conversor de monedas", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Grados celsius a grados fahrenheit", "Grados celsius a grados kelvin",
							"Grados fahrenheit a grados celsius", "Grados fahrenheit a grados kelvin",
							"Grados kelvin a grados celsius", "Grados kelvin a grados fahrenheit" },
					"Seleccion")).toString();
		} catch (NullPointerException e) {

		};

		return opcion;
	}

}
