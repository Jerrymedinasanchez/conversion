package paqueteConversorDeMonedas;

import javax.swing.*;

public class OpcionesConversion {
	ConversionMonedas monedas = new ConversionMonedas();

	public void ConversionMonedas(double valor) {

		String opciones = (JOptionPane.showInputDialog(null,
				"seleccione una opcion a la que desea convertir su dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De pesos Dominicanos a Dolar", "De pesos Dominicanos a Euro",
						"De pesos Dominicanos a libras esterlinas", "De pesos Dominicanos a yen",
						"De pesos dominicanos a won Coreanos", "De Dolar a pesos Dominicanos",
						"De Euros a pesos Dominicanos", "De libras esterlinas a pesos Dominicanos",
						"De yen a pesos Dominicanos", "De wong coreanos a pesos Dominicanos" },
				"Seleccion")).toString();

		switch (opciones) {

		case "De pesos Dominicanos a Dolar":
			monedas.ConvertirPesoDomicanosADollar(valor);
			break;

		case "De pesos Dominicanos a Euro":
			monedas.ConvertirPesoDominicanosAEuro(valor);
			break;

		case "De pesos Dominicanos a libras esterlinas":
			monedas.ConvertirPesoDominicanosALibrasEsterlinas(valor);
			break;

		case "De pesos Dominicanos a yen":
			monedas.ConvertirPesoDominicanosAYen(valor);
			break;

		case "De pesos dominicanos a won Coreanos":
			monedas.ConvertirPesoDominicanosAWongCoreanos(valor);
			break;

		// lo contrario.

		case "De Dolar a pesos Dominicanos":
			monedas.ConvertirDeDolarAPesosDominicanos(valor);
			break;

		case "De Euros a pesos Dominicanos":
			monedas.ConvertirDeEuroAPesoDominicanos(valor);
			break;

		case "De libras esterlinas a pesos Dominicanos":
			monedas.ConvertirDeLibrasEsterlinasAPesosDominicanos(valor);
			break;

		case "De yen a pesos Dominicanos":
			monedas.ConvertirDeYenAPesosDominicanos(valor);
			break;

		case "De wong coreanos a pesos Dominicanos":
			monedas.ConvertirDeWongAPesosDominicanos(valor);
			break;
		}

	}
}
