// Package
package aplicacion_04;

// Imports
import javax.swing.JOptionPane;


// Class
public class Calculator {

	double result;

	/**
	 * Constructor
	 */
	public Calculator() {

	}

	/**
	 * Add
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double sum(double a, double b) {
		result = a + b;
		return result;
	}

	/**
	 * Substract
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double rest(double a, double b) {
		result = a - b;
		return result;
	}

	/**
	 * Multiply
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double multiplication(double a, double b) {
		result = a * b;
		return result;
	}

	/**
	 * Split
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double division(double a, double b) {
		result = a / b;
		return result;
	}

	/**
	 * Square root
	 * 
	 * @param a
	 * @return
	 */
	public double squareRoot(double a) {
		result = Math.sqrt(a);
		return result;
	}

	/**
	 * Cube Root
	 * 
	 * @param a
	 * @return
	 */
	public double cubicRoot(double a) {
		result = Math.cbrt(a);
		return result;
	}

	/**
	 * Power
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double potency(double a, double b) {
		result = Math.pow(a, b);
		return result;
	}

	/**
	 * This method asks the operation the user wants to make
	 */
	public void executeCalc() {

		double value1;
		double value2;
		String operation = JOptionPane.showInputDialog(null,
				"Introduce the symbol of the available operations below: \n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Square root\n6. Cube root\n7. Power\n0. EXIT");
		switch (operation) {
		case "0":
			break;
		case "1":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 2: "));
			JOptionPane.showMessageDialog(null, "Result: " + sum(value1, value2));
			break;
		case "2":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 2: "));
			JOptionPane.showMessageDialog(null, "Result: " + rest(value1, value2));
			break;
		case "3":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 2: "));
			JOptionPane.showMessageDialog(null, "Result: " + multiplication(value1, value2));
			break;
		case "4":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 2: "));
			JOptionPane.showMessageDialog(null, "Result: " + division(value1, value2));
			break;
		case "5":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			JOptionPane.showMessageDialog(null, "Result: " + squareRoot(value1));
			break;
		case "6":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			JOptionPane.showMessageDialog(null, "Result: " + cubicRoot(value1));
			break;
		case "7":
			value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Value 1: "));
			value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Exponent: "));
			JOptionPane.showMessageDialog(null, "Result: " + potency(value1, value2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Wrong option.");
			break;
		}
	}
}
