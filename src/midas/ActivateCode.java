package midas;

import java.util.Scanner;

public class ActivateCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int serial = sc.nextInt();
		int token = sc.nextInt();
		
		String ser = Integer.toBinaryString(serial);
		char[] cser = ser.toCharArray();
		String tok = Integer.toBinaryString(token);
		char[] ctok = tok.toCharArray();
		
		for(int i=0; i<cser.length; i++) {
			
		}
	}
	
	
}
