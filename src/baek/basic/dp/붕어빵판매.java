package baek.basic.dp;

import java.util.Scanner;

//11052
public class ºØ¾î»§ÆÇ¸Å {
	static int[] d;
	static int p[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		d = new int[n+1];
		p = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				d[i] = Math.max(d[i], p[j]+d[i-j]);
			}
		}
		
		System.out.println(d[n]);
	}
	

}
