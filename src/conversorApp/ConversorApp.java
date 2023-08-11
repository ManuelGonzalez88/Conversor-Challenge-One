package conversorApp;

import javax.swing.JOptionPane;

public class ConversorApp {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {

		int continuar;
		String opcion = "";
		String[] opciones = {"Monedas","Temperatura"};

		do {
			/**
			 * Menu inicial
			 */
			try {
			opcion = (JOptionPane.showInputDialog(null, "Elija un conversor:", "Conversor",
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { opciones[0], opciones[1]}, "Seleccion")).toString();
			} catch (NullPointerException e) {
			}

			switch (opcion) {
			case "Monedas": {
				new ConversorMonedas();
				break;
			}
			case "Temperatura": {
				new ConversorTemperatura();
				break;
			}
			}

			continuar = JOptionPane.showConfirmDialog(null, "Desea continuar");

		} while (continuar == 0);

		JOptionPane.showMessageDialog(null, "Programa terminado");
	}

}
