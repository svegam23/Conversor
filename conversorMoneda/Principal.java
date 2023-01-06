package conversorMoneda;

import javax.swing.JOptionPane;

import conversorTiempo.FuncionTiempo;

public class Principal {

	public static void main(String[] args) {
		
		Funcion monedas = new Funcion();
		FuncionTiempo tiempo = new FuncionTiempo();
		
		try {
			String opciones;
			int menuSi = JOptionPane.YES_OPTION;
			
			do {
				
				opciones = ( //Null: en esta parte hace referencia si es o no hijo de una ventana Padre
						//Mensaje al usuario
						// "Menú": titulo de la ventana
						//PErsonalizacion de la ventana
						JOptionPane.showInputDialog(null, "Seleccione la opción que desea", "Menú ", 
								JOptionPane.QUESTION_MESSAGE, null, new Object[] {
										"Conversor de Moneda", "Conversión de tiempo"
								}, "Selección")).toString();
				
				switch (opciones) {
					case "Conversor de Moneda":{
						//validar que el valor ingresado sea un #
						String input = JOptionPane.showInputDialog("Ingrese el $ valor a convertir");
						
						while(!esNumero(input)) {
							JOptionPane.showMessageDialog(null, "Ha ingresado un valor $ invalido", "Error", JOptionPane.ERROR_MESSAGE);
							input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor $");
						}
						
						double valorRecibido = Double.parseDouble(input);
						monedas.ConvertirMoneda(valorRecibido); 
						
						int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						 System.out.println(seleccion);
						
					}
					break;
					
					case "Conversión de tiempo":{
						String input = JOptionPane.showInputDialog("Ingrese el Tiempo a convertir");
						while(!esNumero(input)) {
							JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido", "Error", JOptionPane.ERROR_MESSAGE);
							input = JOptionPane.showInputDialog(null, "Por favor ingrese el Tiempo");
						}
						
						double tiempoRecibido = Double.parseDouble(input);
						tiempo.ConvertirTiempo(tiempoRecibido);
						
						int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						 System.out.println(seleccion);
						 
						
					}
					break;
			
					default:
						break;
				}
				
			}while(JOptionPane.YES_OPTION == menuSi);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Gracias por hacer uso del programa!");
			
		}
		
		
	}
	
	//Método de validación
	private static boolean esNumero (String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
}
