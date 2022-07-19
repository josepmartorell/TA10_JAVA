import javax.swing.JOptionPane;

import ExceptionsTA10.*;
import aplicacion_02.Ex2;


public class MainApp {

	/**
	 * Main method that calls the main menu
	 * 
	 * @param args
	 * @throws ExceptionEx2 
	 */
	public static void main(String[] args) throws ExceptionEx2 {
		initializeMenu();
	}

	/**
	 * Initial menu
	 * @throws ExceptionEx2 
	 */
	public static void initializeMenu() throws ExceptionEx2 {

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
				Exercise2Test();
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
	
	/**
	 * This method tests the second exercise of the task
	 * 
	 * @throws ExceptionEx2
	 */
	public static void Exercise2Test() throws ExceptionEx2{
		// We ask for a value different from 99
		int value = Integer.parseInt(JOptionPane.showInputDialog("We will test an Exception. Type a value thats not 99:"));
		
		// We create the class "Ex2" with the value asked
		Ex2 ex2 = new Ex2(value);
		
		// We test the value and show a message
		ex2.testValue();
	}
}
