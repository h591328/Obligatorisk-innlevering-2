package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Lab3_Opg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(showInputDialog("Skriv inn et positivt heltall:"));
		
		int svar = 1;
		
		if(n >= 0) {
			
			for(int i = 1; i <= n; i++) {
				
				svar = svar * i;}
			
			showMessageDialog(null, svar);
			
			
			}
		}

	}



