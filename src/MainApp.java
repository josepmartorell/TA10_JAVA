import javax.swing.JOptionPane;


public class MainApp {

	/**
	 * Main method that calls the main menu
	 * 
	 * @param args
	 * @throws ExceptionEx2 
	 */
	public static void main(String[] args) {
		initializeMenu();
	}

	/**
	 * Initial menu
	 */
	public static void initializeMenu() {

		// Menu options
		final String menuOptions = "Choose an Exercise from TA10 or 0 to exit:" + "\n1 - First Exercise" + "\n2 - Second Exercise" + "\n0 - EXIT";
		String option = "";

		// Infinite iteration of the menu until its closed with Exit
		do {
			option = JOptionPane.showInputDialog(menuOptions);
			switch (option) {
			case "0":
				JOptionPane.showMessageDialog(null, "End of the program.");
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
				JOptionPane.showMessageDialog(null, "Wrong option.");
			}

		} while (!option.equals("0"));
		
	}
}
