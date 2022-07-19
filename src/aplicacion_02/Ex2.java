// Package
package aplicacion_02;

// Imports
import ExceptionsTA10.ExceptionEx2;

// Class
public class Ex2 {
	
	// Attributes
	private final int correctValue = 99;
	private int value;
	
	
	// Constructor
	/**
	 * Class constructor
	 * 
	 * @param value
	 */
	public Ex2(int value) {
		this.value = value;
	}

	
	// Getters and setters
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the correctValue
	 */
	public int getCorrectValue() {
		return correctValue;
	}
	
	
	// Other methods
	
	/**
	 * This methods tests the ExceptionEx2
	 * 
	 * @throws ExceptionEx2
	 */
	public void testValue() throws ExceptionEx2 {
		try {
			System.out.println("Console message showed");
			
			// We compare the two values
			if (this.getValue()!=this.getCorrectValue()) {
				// If they are now the same we show a message and throw an Exception
				System.out.print("Exception catched with message: ");
				throw new ExceptionEx2("1");
			} else {
				// If they are the same we show a message
				System.out.println("You wrote 99. No Exception catched.");
			}
		} catch(ExceptionEx2 e) {
			// We catch the exception
			System.out.println(e.getMessage());
		} finally {
			// Whatever happens we show an end message
			System.out.println("End of the program");
		}
	}
	
}
