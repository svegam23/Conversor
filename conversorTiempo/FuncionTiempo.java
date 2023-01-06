package conversorTiempo;

import javax.swing.JOptionPane;

public class FuncionTiempo {

	ConversorTiempo tiempo = new ConversorTiempo();
	
	public void ConvertirTiempo(double TiempoRecibido) {
		
		String opciones = (
				JOptionPane.showInputDialog(null, "Seleccione el tipo de tiempo a convertir", "Tiempo",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"De segundo a minuto", "Minuto a Hora", "Hora a Día",
							"Minuto a Segundo", "Hora a Minuto", "De Día a Hora"
						}, "Selección")).toString();
		
		switch (opciones) {
		case "De segundo a minuto":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;
		case "Minuto a Hora":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;
		case "Hora a Día":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;
		case "Minuto a Segundo":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;
		case "Hora a Minuto":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;
		case "De Día a Hora":
			tiempo.SegundoAMinuto(TiempoRecibido);
			break;

		default:
			break;
		}
	
	}
	
	
}
