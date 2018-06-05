package baek.basic.graph;

import java.util.Scanner;

public class 반복수열 {
	static int[] chk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		chk = new int[1000000];
		
		System.out.println(dfs(A, P, 1));
	}
	
	static int dfs(int now, int p, int cnt) {
		if(chk[now] != 0)
			return chk[now]-1;
		chk[now] = cnt;
		String tmp = String.valueOf(now);
		String[] split = tmp.split("");
		
		int next = 0;
		for(int i=0; i<split.length; i++) {
			int val = Integer.parseInt(split[i]);
			next+=Math.pow(val, p);
		}
		
		return dfs(next, p, cnt+1);
	}
}
