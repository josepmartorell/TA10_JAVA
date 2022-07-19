// Package
package aplicacion_04;

import javax.swing.JOptionPane;

// Imports

// Class
public class Calculator {
	
	double result;

	public Calculator() {
		
	}
	
	public double sum(double a, double b) {
		result = a + b;
		return result;
	}
	
	public double rest(double a, double b) {
		result = a - b;
		return result;
	}
	
	public double multiplication(double a, double b) {
		result = a * b;
		return result;
	}
	
	public double division(double a, double b) {
		result = a / b;
		return result;
	}
	
	public void executeCalc() {}
	
}
