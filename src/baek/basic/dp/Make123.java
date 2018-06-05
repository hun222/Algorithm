package baek.basic.dp;

import java.util.Scanner;

public class Make123 {
	static int[] d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0) {
			int n = sc.nextInt();
			d = new int[n+1];
			System.out.println(go(n));
		}
	}
	
	static int go(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		
		d[n] = go(n-3) + go(n-2) + go(n-1);
		
		return d[n];
	}
}
