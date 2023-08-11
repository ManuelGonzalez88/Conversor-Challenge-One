import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.BorderLayout;

public class ConversorGrafico extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;

	Scanner ingresarDato = new Scanner(System.in);

	public ConversorGrafico() {

		setVisible(true);
		setSize(400, 300);
		setTitle("Conversor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		mostrarMenu();
		menu = new JMenu("Elegir una opcion");
		panel.add(menu);
		opcion1 = new JMenuItem("De Pesos a Dolares.");
		opcion2 = new JMenuItem("Dolares a Pesos.");
		opcion3 = new JMenuItem("Peso a Euros.");
		opcion4 = new JMenuItem("Euro a Pesos.");
		opcion5 = new JMenuItem("Salir.");
		
				menu.add(opcion1);
				menu.add(opcion2);
				menu.add(opcion3);
				menu.add(opcion4);
				menu.add(opcion5);
				
						opcion1.addActionListener(new ActionListener() {
				
							@Override
							public void actionPerformed(ActionEvent e) {
								convertir("pesos", "dolares", 550, ingresarDato);
							}
						});
						
								opcion2.addActionListener(new ActionListener() {
						
									@Override
									public void actionPerformed(ActionEvent e) {
										convertir("dolares", "pesos", 550, ingresarDato);
									}
								});
								
										opcion3.addActionListener(new ActionListener() {
								
											@Override
											public void actionPerformed(ActionEvent e) {
												convertir("pesos", "euros", 590, ingresarDato);
											}
										});
										
												opcion4.addActionListener(new ActionListener() {
										
													@Override
													public void actionPerformed(ActionEvent e) {
														convertir("euros", "pesos", 590, ingresarDato);
													}
												});
												
														opcion5.addActionListener(new ActionListener() {
												
															@Override
															public void actionPerformed(ActionEvent e) {
																JOptionPane.showMessageDialog(null, "Saliendo del programa");
																System.exit(0);
												
															}
														});
		
		panel.add(menuBar);
		getContentPane().add(panel, BorderLayout.CENTER);

	}

	public void mostrarMenu() {

		menuBar = new JMenuBar();

	}

	public void convertir(String monedaEntrada, String monedaSalida, double valorMoneda, Scanner entrada) {

		String cantidad = JOptionPane.showInputDialog(menuBar,
				"Ingrese la cantidad de " + monedaEntrada + " para convertir a " + monedaSalida);

		while (!cantidad.matches("\\d{1,99}")) {
			cantidad = JOptionPane.showInputDialog(menuBar, "Ingrese una cantidad valida");
		}
		;

		double cantidadConvertida;

		if (monedaEntrada == "pesos") {
			cantidadConvertida = Double.parseDouble(cantidad) / valorMoneda;
		} else {
			cantidadConvertida = Double.parseDouble(cantidad) * valorMoneda;
		}

		JOptionPane.showMessageDialog(menuBar, "La cantidad de " + monedaSalida + " es: " + cantidadConvertida);

	}

	public static void main(String[] args) {

		new ConversorGrafico();

	}

}
