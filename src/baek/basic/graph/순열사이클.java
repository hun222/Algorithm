package baek.basic.graph;

import java.util.Scanner;

public class 순열사이클 {
	static int[] a;
	static boolean[] chk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-- >0) {
			int n = sc.nextInt();
			a = new int[n+1];
			chk = new boolean[n+1];
			
			for(int i=1; i<=n; i++)
				a[i] = sc.nextInt();
			
			int rst = 0;
			for(int i=1; i<=n; i++) {
				if(!chk[i] ) {
					dfs(i);
					rst += 1;
				}
			}
			
			System.out.println(rst);
		}
	}
	
	static void dfs(int x) {
		if(chk[x]) return;
		chk[x] = true;
		dfs(a[x]);
	}
}
