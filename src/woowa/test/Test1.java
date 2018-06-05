package woowa.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean chk[] = new boolean[n+1];
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				chk[i] = true;
		}
		
		for(int i=1; i<=n; i++) {
			if(chk[i] == true)
				System.out.print(i+" ");
		}
	}
}
