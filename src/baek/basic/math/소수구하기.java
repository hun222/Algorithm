package baek.basic.math;

import java.util.Scanner;

//에라토스테네스의 체
public class 소수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //3
		int n = sc.nextInt(); //16
		
		boolean[] c = new boolean[n+1];
		c[0] = c[1] = true;
		for(int i=2; i*i<=n; i++) {
			if(c[i]==true)
				continue;
			
			for(int j=i+i; j<=n; j+=i)
				c[j]=true;
		}
		for(int i=m; i<=n; i++) {
			if(c[i]==false){
				System.out.println(i);
			}
		}
	}
}
