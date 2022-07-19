// Package
package aplicacion_05;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Class
public class Password {
	
	// Constants
	private final int DEF_LENGTH = 8;
	
	// Attributes
	private int length;
	private String pass;

	/**
	 * Default constructor
	 */
	public Password() {
		this.length = DEF_LENGTH;
		this.pass = "";
	}
	
	/**
	 * Constructor by length
	 * 
	 * @param len
	 */
	public Password(int len) {
		this.length = len;
		this.pass = this.generatePass(len);
	}

	
	// Getters and setters
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	
	
	// Other methods
	
	/**
	 * This methods creates a random password with the length in the argument
	 * 
	 * @param len the length
	 * @return the random password
	 */
	private String generatePass(int l) {
		// All chars and numbers with CAPS and without CAPS
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();

		/*
		 * We start an iteration for the length introduced. Each iteration randomly
		 * chooses a char from "chars"
		 */
		return IntStream.range(0, l).map(i -> random.nextInt(chars.length()))
				.mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex))).collect(Collectors.joining());
	}

	/**
	 * This method validates the quality of the pass (strength).
	 * A strong password needs 2 uppercase letters, more than 1 lowercase letters and more than 5 numbers
	 * 
	 * @param pass
	 * @return
	 */
	public boolean isStrong(String pass) {
		// We initialize a counter for each condition and a boolean
		boolean strong = false;
		int countUpper = 0;
		int countLower = 0;
		int countNumbers = 0;
		int i = 0;
		while(i<pass.length() && strong==false) {
			// First we check for uppercase letter
			if(Character.isUpperCase(pass.charAt(i))) {
				countUpper++;
			} else if (Character.isDigit(pass.charAt(i))) {
				// Then we check for number
				countNumbers++;
			} else if (Character.isLowerCase(pass.charAt(i))) {
				// And for lowercase char
				countLower++;
			}
			
			// If we have all the conditions for strong pass we change the boolean
			if((countUpper>=2) && (countNumbers>=5) && (countLower>=1)) {
				strong = true;
			}
			
			i++;
		}
		return strong;
	}
	
	
}
