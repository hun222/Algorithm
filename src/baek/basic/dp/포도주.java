package baek.basic.dp;

import java.util.Scanner;
//2156
public class Æ÷µµÁÖ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = 3;
		int[] arr = new int[n+1];
		int[][] d = new int[n+1][3];
		for(int i=1; i<=n; i++)
			arr[i] = sc.nextInt();
		
		//setting
		d[1][0] = 0;
		d[1][1] = arr[1];
		d[1][2] = d[1][1];
		
		for(int i=1; i<=n; i++) {
			d[i][2] = d[i-1][1] + arr[i];
			d[i][1] = d[i-1][0] + arr[i];
			d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
		}
		
		int rst = d[n][0];
		
		for(int i=1; i<3; i++) {
			if(d[n][i]>rst)
				rst = d[n][i];
		}
		
		System.out.println(rst);
	}
}
