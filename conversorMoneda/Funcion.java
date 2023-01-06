package conversorMoneda;

import javax.swing.JOptionPane;

public class Funcion {

	ConversorMoneda monedas = new ConversorMoneda();
	
	public void ConvertirMoneda(double ValorRecibido) {
		String opciones = ( 
				JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "Monedas ", 
						JOptionPane.PLAIN_MESSAGE, null, new Object[] {
								"De peso Colombiano a Dolar", "De peso Colombiano a Euro", "De peso Colombiano a Yen", "De peso Colombiano a Won", "De peso Colombiano a Libra esterlina",
								"De Dolar a Peso Colombiano", "De Euro a Peso Colombiano", "De Yen a Peso Colombiano", "De Won a Peso Colombiano", "De Libra esterlina a Peso Colombiano"
						}, "Selección")).toString();
		
		switch (opciones) {
		case "De peso Colombiano a Dolar":
			monedas.ConvertirPesosADolar(ValorRecibido);
			break;
		case "De peso Colombiano a Euro":
			monedas.ConvertirPesosAEuro(ValorRecibido);
			break;
		case "De peso Colombiano a Yen":
			monedas.ConvertirPesosAYen(ValorRecibido);
			break;
		case "De peso Colombiano a Won":
			monedas.ConvertirPesosAWon(ValorRecibido);
			break;
		case "De peso Colombiano a Libra esterlina":
			monedas.ConvertirPesosALibra(ValorRecibido);
			break;
		case "De Dolar a Peso Colombiano":
			monedas.ConvertirDolarAPeso(ValorRecibido);
			break;
		case "De Euro a Peso Colombiano":
			monedas.ConvertirEuroAPeso(ValorRecibido);
			break;
		case "De Yen a Peso Colombiano":
			monedas.ConvertirYenAPeso(ValorRecibido);
			break;
		case "De Won a Peso Colombiano":
			monedas.ConvertirWonAPeso(ValorRecibido);
			break;
		case "De Libra esterlina a Peso Colombiano":
			monedas.ConvertirLibraAPeso(ValorRecibido);
			break;
		default:
			break;
		}
	}
	
	
}
