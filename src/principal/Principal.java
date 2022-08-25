package principal;
import javax.swing.*;

import paqueteConversorDeMonedas.OpcionesConversion;

public class Principal {
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
		while(true) {
			String opciones =JOptionPane.showInputDialog(null, "seleccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"conversor de moneda", "conversor de temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			case "conversor de moneda":
				String input = JOptionPane.showInputDialog(null, "Ingrese su valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConversionMonedas(valorRecibido);
				
				int resposta = JOptionPane.showConfirmDialog(null, "desea realizar otra conversion?");
				if(JOptionPane.OK_OPTION == resposta) {
					System.out.println("");
				}
				else {
					JOptionPane.showMessageDialog(null, "programa finalizado");
				}
			}
		
		}	
		}
}
