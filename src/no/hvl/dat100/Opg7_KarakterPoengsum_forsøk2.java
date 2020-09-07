package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Opg7_KarakterPoengsum_forsøk2 {

	public static void main(String[] args) {
		
		for(int studentnr = 1; studentnr <=10; studentnr++) {
			
			int x =0;
			
			do {
		
		 x = parseInt( showInputDialog("Gi poengsum i prosent:"));
		
		
		 if(x >=90 && x <= 100) {
				showMessageDialog(null, "karakter: A");
			}	
			else if(x >=80 && x <=89){
				showMessageDialog(null, "karakter: B");
			}	
			else if(x >=60 && x <=79) {
				showMessageDialog(null, "karakter: C");
			}	
			else if(x >=50 && x <=59) {
				showMessageDialog(null, "karakter: D");
			}	
			else if(x >=40 && x <=49) {
				showMessageDialog(null, "karakter: E");
			}	
			else if(x >=0 && x <=39) {
				showMessageDialog(null, "karakter: F");
			}
		 if(x<0 && x>100)
			 showMessageDialog(null, "Feilmelding! Poengsum må være mellom 0-100");
		 
			}while (x<0||x>100);
	
		}
	}

{
}
}