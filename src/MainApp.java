import javax.swing.JOptionPane;

public class MainApp {

	/**
	 * Metodo main que llama al menu principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		initializeMenu();
	}

	/**
	 * Menu inicial
	 */
	public static void initializeMenu() {

		// Mensaje con las diferentes opciones del menu
		final String menuOpciones = "Elija una opcion." + "\n1 - Aplicacion" + "\n2 - Aplicacion"
				+ "\n3 - Aplicacion" + "\n4 - Aplicacion" + "\n5 - Aplicacion" + "\n0 - SALIR";
		String opcion = "";

		// Bucle infinito del menu hasta que se cierre con el Exit o cancelando
		do {
			opcion = JOptionPane.showInputDialog(menuOpciones);
			switch (opcion) {
			case "0":
				JOptionPane.showMessageDialog(null, "FIN DE PROGRAMA");
				break;
			case "1":
				// TODO
				break;
			case "2":
				// TODO
				break;
			case "3":
				// TODO
				break;
			case "4":
				// TODO
				break;
			case "5":			
				// TODO
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}

		} while (!opcion.equals("0"));
		
	}	
	
}
