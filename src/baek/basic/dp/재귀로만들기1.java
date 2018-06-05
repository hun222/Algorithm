package baek.basic.dp;

import java.util.Scanner;

public class Àç±Í·Î¸¸µé±â1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d[] = new int[n+1];
		System.out.println(recur(n, d));
	}
	
	static int recur(int n, int[] d) {
		if(n==1)
			return 0;
		
		if(d[n]>0)return d[n];
		
		d[n] = recur(n-1,d) + 1;
		
		if(n%2==0) {
			int tmp = recur(n/2,d) + 1;
			if(d[n] > tmp) d[n]=tmp;
		}
		
		if(n%3==0) {
			int tmp = recur(n/3,d) + 1;
			if(d[n] > tmp) d[n]=tmp;
		}
		
		return d[n];
	}
}
