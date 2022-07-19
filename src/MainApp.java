// Imports
import javax.swing.*;

import ExceptionsTA10.*;
import aplicacion_02.Ex2;
import aplicacion_04.Calculator;
import aplicacion_05.Password;

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
	 * 
	 * @throws ExceptionEx2
	 */
	public static void initializeMenu() throws ExceptionEx2 {

		// Menu options
		final String menuOptions = "Choose an Exercise from TA10 or 0 to exit:" + "\n1 - First Exercise"
				+ "\n2 - Second Exercise" + "\n3 - Third Exercise" + "\n4 - Fourth Exercise" + "\n5 - Fifth Exercise"
				+ "\n0 - EXIT";
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
				Exercise4Test();
				break;
			case "5":
				Exercise5Test();
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
	public static void Exercise2Test() throws ExceptionEx2 {
		// We ask for a value different from 99
		int value = Integer
				.parseInt(JOptionPane.showInputDialog("We will test an Exception. Type a value thats not 99:"));

		// We create the class "Ex2" with the value asked
		Ex2 ex2 = new Ex2(value);

		// We test the value and show a message
		ex2.testValue();
	}

	/**
	 * This method tests the fourth exercise of the task
	 */
	public static void Exercise4Test() {

		Calculator calc = new Calculator();
		try {
			calc.executeCalc();
		} catch (Exception e) {
			// We catch the exception
			System.out.println(e.getMessage());
		} finally {
			// Whatever happens we show an end message
			System.out.println("End of the calculator.");
		}

	}

	/**
	 * This method tests the fifth exercise of the task
	 */
	public static void Exercise5Test() {
		// instantiate the password class
		Password password = new Password(12);

		// we show the randomly generated password in a dialog box
		JOptionPane.showMessageDialog(null, password);

		// we ask the user to enter the size of an array and the length of the passwords
		// that we will store
		JTextField input1 = new JTextField(5);
		JTextField input2 = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Enter the array size: "));
		myPanel.add(input1);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("Enter the password length: "));
		myPanel.add(input2);

		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Size and Length Values",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("Array size: " + input1.getText());
			System.out.println("Password length: " + input2.getText());
		}
		// parse both data to Integer
		int parsedData1 = Integer.parseInt(input1.getText());
		int parsedData2 = Integer.parseInt(input2.getText());

		// we declare an array to store random generated passwords with the above data
		Password[] array = new Password[parsedData1];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Password(parsedData2);
			System.out.println("SYSO: " + array[i]);
		}

	}

}
