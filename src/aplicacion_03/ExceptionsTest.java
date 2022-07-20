package aplicacion_03;

import javax.swing.JOptionPane;
import myexception.MyException;

public class ExceptionsTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
	public static boolean isEven(int num) {
	    if (num % 2 == 0) {
	        return true;
	    } else {
	        return false;
	    }
	}

}
