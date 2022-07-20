package aplicacion_01;

import javax.swing.JOptionPane;

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gate = true;
		int attempts = 0;
		
		do {
			// WE GENERATE A RANDOM NUMBER BETWEEN 1 AND 500
			int secretNumber = 0;
			secretNumber = (int) (Math.random()*(500+1)+1);
			System.out.println(secretNumber);
			
			// THE PROGRAM ASKS FOR THE SECRET NUMBER THROUGH AN EMERGING WINDOW
			String userData = "";
			int parsedData = 0;
			userData = JOptionPane.showInputDialog(null, "GUESS THE SECRET NUMBER", "Please enter a number");
			
			// DATA VALIDATION NUMBER FORMAT
			try {
				if (userData != null) {			 
					parsedData = Integer.parseInt(userData);				
				}else {
					System.exit(0);
				};
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e, "I CATCH YOU!", JOptionPane.ERROR_MESSAGE);
			}
						
			// SHOWS A MESSAGE INDICATING WHETHER THE HIGHEST OR LOWEST AND IF CORRECT SHOWS THE NUMBER OF ATTEMPTS
			attempts++;
			if (parsedData == secretNumber) {
				JOptionPane.showMessageDialog(null, "Correct number!", "ATTEMPTS: "+attempts, JOptionPane.INFORMATION_MESSAGE);
				gate = false;
			}else if (parsedData != secretNumber) {
				JOptionPane.showMessageDialog(null, "Wrong number, try again!", "ATTEMPTS: "+attempts, JOptionPane.INFORMATION_MESSAGE);
			} else {

			}
			
		} while (gate != false);

	}

}
