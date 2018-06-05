package baek.basic.dp;

import java.util.Scanner;

public class 스티커떼기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0) {
			int n = sc.nextInt();
			int a[][] = new int[2][n+1];
			int d[][] = new int[n+1][3];
			
			//a[][] 채우기
			for(int i=0; i<2; i++) {
				for(int j=1; j<=n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			d[1][0] = 0;
			d[1][1] = a[0][1];
			d[1][2] = a[1][1];
			
			for(int i=2; i<=n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + a[0][i];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + a[1][i];
			}
			
			int rst = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(rst);
		}
	}
}
