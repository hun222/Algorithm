package baek.basic.dp;

import java.util.Scanner;

//11057
public class 오르막수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mod = 10007;
		int n = sc.nextInt();
		int [][]d = new int[n+1][10];
		
		for(int i=0; i<=9; i++)
			d[1][i] = 1;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=j; k++) {
					d[i][j] += d[i-1][k];
					d[i][j]%=mod;
				}
			}
		}
		
		int ans = 0;
		for(int i=0; i<=9; i++)
			ans += d[n][i];
		
		ans %= mod;
		System.out.println(ans);
	}
}
