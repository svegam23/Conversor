package conversorMoneda;

import javax.swing.JOptionPane;

public class ConversorMoneda {

	public void ConvertirPesosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4962.98;
		monedaDolar = (double)Math.round(monedaDolar*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Dolares");
	}
	
	public void ConvertirPesosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 5217.64;
		monedaEuro = (double)Math.round(monedaEuro*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaEuro+" Euros");
	}
	
	public void ConvertirPesosAYen(double valorRecibido) {
		double monedaDolar = valorRecibido / 37.15;
		monedaDolar = (double)Math.round(monedaDolar*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Yen");
	}
	
	public void ConvertirPesosAWon(double valorRecibido) {
		double monedaDolar = valorRecibido / 3.88;
		monedaDolar = (double)Math.round(monedaDolar*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Won");
	}
	
	public void ConvertirPesosALibra(double valorRecibido) {
		double monedaDolar = valorRecibido / 5903.09;
		monedaDolar = (double)Math.round(monedaDolar*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Libras Esterlinas");
	}
	
	/////
	
	public void ConvertirDolarAPeso(double valorRecibido) {
		double monedaDolar = valorRecibido * 4962.98;
		monedaDolar = (double)Math.round(monedaDolar*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Pesos");
	}
	
	public void ConvertirEuroAPeso(double valorRecibido) {
		double monedaEuro = valorRecibido * 5217.64;
		monedaEuro = (double)Math.round(monedaEuro*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaEuro+" Pesos");
	}
	
	public void ConvertirYenAPeso(double valorRecibido) {
		double moneda = valorRecibido * 37.15;
		moneda = (double)Math.round(moneda*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+moneda+" Pesos");
	}
	
	public void ConvertirWonAPeso(double valorRecibido) {
		double moneda = valorRecibido * 3.88;
		moneda = (double)Math.round(moneda*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+moneda+" Pesos");
	}
	
	public void ConvertirLibraAPeso(double valorRecibido) {
		double moneda = valorRecibido * 5903.09;
		moneda = (double)Math.round(moneda*100)/100;//esto para que muestre solo 2 decimales
		//Muestra al usuario el valor de la conversión
		JOptionPane.showMessageDialog(null, "Tienes $"+moneda+" Pesos");
	}
	
}
