package baek.basic.dp;

import java.util.Scanner;

//1463
//bottom - top
public class ¸¸µé±â1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int [n+1];
		
		for(int i=1; i<=n; i++) {
			if(i+1 < n+1 && (d[i+1] > d[i] + 1 || d[i+1] ==0))
				d[i+1] = d[i] + 1;
			if(i*3 < n+1 && (d[i*3] > d[i] + 1 || d[i*3] ==0))
				d[i*3] = d[i] + 1;
			if(i*2 < n+1 && (d[i*2] > d[i] + 1 || d[i*2] ==0))
				d[i*2] = d[i] + 1;
		}
		
		System.out.println(d[n]);
	}
}
