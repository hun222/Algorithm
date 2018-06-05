package baek.basic.dp;

import java.util.Scanner;

//11726
public class Å¸ÀÏ¸µ2Xn {
	static int[] d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		d = new int[n+1];
		
		System.out.println(go(n));
	}
	
	static int go(int n){
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 1;
		}
		if(d[n]>0)
			return d[n];
		
		d[n] = go(n-1) + go(n-2);
		d[n] %= 10007;
		
		return d[n];
	}
}
