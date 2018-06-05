package woowa.test;

import java.util.Scanner;

public class Test3 {
	static String y = "Leap Year";
	static String p = "Not Leap Year";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = p;
		if(n%4==0) {
			str = y;
			if(n%100==0) {
				str = p;
				if(n%400==0)
					str = y;
			}
		}
		
		System.out.println(str);
	}
}
