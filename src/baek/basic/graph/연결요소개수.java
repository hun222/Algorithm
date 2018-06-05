package baek.basic.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 연결요소개수 {
	static boolean chk[];
	static List<List<Integer>> adlist;
	static int sum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		adlist = new ArrayList();
		chk = new boolean[n+1];
		
		for(int i=0; i<=n; i++)
			adlist.add(new ArrayList());
		
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adlist.get(v1).add(v2);
			adlist.get(v2).add(v1);
		}
		
		int rst = 0;
		
		for(int i=1; i<=n; i++) {
			if(!chk[i]) {
				dfs(i);
				rst += 1;
			}
		}
		
		System.out.println(rst);
	}
	static void dfs(int now) {
		if(!chk[now]) 
			//System.out.print(now+" ");
		chk[now] = true;
		
		for(int i=0; i<adlist.get(now).size(); i++) {
			int next = adlist.get(now).get(i);
			if(!chk[next])
				dfs(next);
		}
		
	}
}
