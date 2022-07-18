import javax.swing.JOptionPane;

public class MainApp {

	/**
	 * Main method that calls the main menu
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		initializeMenu();
	}

	/**
	 * Initial menu
	 */
	public static void initializeMenu() {

		// Mensaje con las diferentes opciones del menu
		final String menuOpciones = "Choose an option." + "\n1 - App" + "\n0 - EXIT";
		String option = "";

		// Bucle infinito del menu hasta que se cierre con el Exit o cancelando
		do {
			option = JOptionPane.showInputDialog(menuOpciones);
			switch (option) {
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
				JOptionPane.showMessageDialog(null, "Wrong option");
			}

		} while (!option.equals("0"));
		
	}	
	
}
