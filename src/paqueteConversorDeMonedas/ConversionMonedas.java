package paqueteConversorDeMonedas;
import javax.swing.*;

public class ConversionMonedas {
	
	public void ConvertirPesoDomicanosADollar(double valor) {
		double monedaDolar = valor / 52.6966;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaDolar + "dolares");
		
	}
	
	public void ConvertirPesoDominicanosAEuro(double valor) {
		double monedaEuro = valor / 52.4418;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaEuro + "Euros");
		
	}
	
	public void ConvertirPesoDominicanosALibrasEsterlinas(double valor) {
		double monedaLibrasEsterlinas = valor / 62.1765;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaLibrasEsterlinas + "LibrasEsterlinas");
		
	}
	
	public void ConvertirPesoDominicanosAYen(double valor) {
		double monedaYen = valor / 0.38503;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaYen + "Yen");
		
	}
	
	public void ConvertirPesoDominicanosAWongCoreanos(double valor) {
		double monedaWongCoreano = valor / 0.39034;
		monedaWongCoreano = (double) Math.round(monedaWongCoreano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaWongCoreano + "Wong");
		
	}
	
	//caso contrario.
	
	public void ConvertirDeDolarAPesosDominicanos(double valor) {
		double monedaPesoDominicano = valor / 0.0186;
		monedaPesoDominicano = (double) Math.round(monedaPesoDominicano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaPesoDominicano + "Pesos Dominicanos");
		
	}
	
	public void ConvertirDeEuroAPesoDominicanos(double valor) {
		double MonedaPesosDominicanos = valor / 0.01868;
		MonedaPesosDominicanos = (double) Math.round(MonedaPesosDominicanos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + MonedaPesosDominicanos + "Pesos Dominicanos");
		
	}
	
	public void ConvertirDeLibrasEsterlinasAPesosDominicanos(double valor) {
		double monedaPesosDominicanos = valor / 0.01576;
		monedaPesosDominicanos = (double) Math.round(monedaPesosDominicanos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaPesosDominicanos + "Pesos Dominicanos");
		
	}
	
	public void ConvertirDeYenAPesosDominicanos(double valor) {
		double monedaPesosDominicanos = valor / 2.54498;
		monedaPesosDominicanos = (double) Math.round(monedaPesosDominicanos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaPesosDominicanos + "Pesos Dominicanos");
		
	}
	
	public void ConvertirDeWongAPesosDominicanos(double valor) {
		double monedaPesosDominicanos = valor / 2.51067;
		monedaPesosDominicanos = (double) Math.round(monedaPesosDominicanos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaPesosDominicanos + "Pesos Colombianos");
		
	}
	
	
	
	
}
