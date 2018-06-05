package baek.basic.dp;

import java.util.Scanner;

//11053
public class 가장긴증가하는순열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		
		for(int i=1; i<=n; i++)
			a[i] = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			d[i] = 1;
			
			for(int j=1; j<=i; j++) {
				if(a[i]>a[j] && d[i] < d[j] +1)
					d[i] = d[j]+1;
			}
		}
		
		int rst = d[1];
		for(int i=1; i<=n; i++) {
			if(d[i]>rst)
				rst = d[i];
		}
		System.out.println(rst);
	}
}
