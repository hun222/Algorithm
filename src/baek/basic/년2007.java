package baek.basic;

import java.util.Scanner;

public class 년2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wol = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int w = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = calWol(w,wol)+d;
		
		System.out.println(day[sum%7]);
	}
	
	static int calWol(int w, int[] wol) {
		int total = 0;
		//전월까지의 day 합
		for(int i=0; i<w; i++)
			total += wol[i];
		
		return total;
	}
}
