package aplicacion_03;

import javax.swing.JOptionPane;
import ExceptionsTA10.*;

public class ExceptionsTest {
	
	/**
	 * Default constructor
	 */
	public ExceptionsTest() {}
	
	/**
	 * Generate random number and checks if its even or odd
	 */
	public void randomNumber() {
		
		boolean gate = false;
		String message = "";
		
		do {			
			// WE GENERATE A RANDOM NUMBER BETWEEN 0 AND 999
			int randomNumber = 0;
			randomNumber = (int) (Math.random()*(999+0)+0);
			System.out.println(randomNumber);
			
			// CHECK IF IT IS EVEN OR ODD AND THROWS AN EXCEPTION	
			try {
				boolean check = isEven(randomNumber);
				if (check) {
					throw new MyException("1");
				} else {
					throw new MyException("2");
				}
				
			} catch(MyException e){
	            JOptionPane.showMessageDialog(null, e);
			}
							
		} while (gate != false);

	}
	
	/**
	 * Check if its even or odd
	 * 
	 * @param num
	 * @return
	 */
	public boolean isEven(int num) {
	    if (num % 2 == 0) {
	        return true;
	    } else {
	        return false;
	    }
	}

}
