package baek.basic;

import java.util.Scanner;
//9012
public class °ýÈ£ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			System.out.println(isValid(sc.nextLine()));
		}
	}
	
	static String isValid(String s) {
		int cnt = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				cnt += 1;
			}else {
				cnt -= 1;
			}
			
			if(cnt < 0)
				return "NO";
		}
		
		if(cnt == 0)
			return "YES";
		else
			return "NO";
	}
}
