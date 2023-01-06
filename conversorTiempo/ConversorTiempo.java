package conversorTiempo;

import javax.swing.JOptionPane;

public class ConversorTiempo {

	public void SegundoAMinuto(double valorRecibido) {
		double minutos = valorRecibido / 60;
		minutos = (double)Math.round(minutos * 100) / 100; 
		JOptionPane.showMessageDialog(null, "Son "+minutos+" minutos");
	}
	
	public void MinutoAHora(double valorRecibido) {
		double horas = valorRecibido / 60;
		horas = (double)Math.round(horas * 100) / 100;
		JOptionPane.showMessageDialog(null, "Son "+horas+" horas");
	}
	
	public void HoraADia(double valorRecibido) {
		double dias = valorRecibido / 25;
		dias = (double)Math.round(dias * 100) / 100;
		JOptionPane.showMessageDialog(null, "Son "+dias+" días");
	}
	
	public void MinutoASegundo(double valorRecibido) {
		double segundos = valorRecibido * 60;
		segundos = (double)Math.round(segundos * 100) / 100;
		JOptionPane.showMessageDialog(null, "Son "+segundos+" minutos");
	}
	
	public void HoraAMinuto(double valorRecibido) {
		double minutos = valorRecibido * 60;
		minutos = (double)Math.round(minutos * 100) / 100;
		JOptionPane.showMessageDialog(null, "Son "+minutos+" minutos");
	}
	
	public void DiaAHora(double valorRecibido) {
		double horas = valorRecibido * 24;
		horas = (double)Math.round(horas * 100) / 100;
		JOptionPane.showMessageDialog(null, "Son "+horas+" minutos");
	}
	
}
