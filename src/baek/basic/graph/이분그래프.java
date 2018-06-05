package baek.basic.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 이분그래프 {
	static List<List<Integer>> adlist;
	static int[] color;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			adlist = new ArrayList();
			
			for(int i=0; i<=n; i++)
				adlist.add(new ArrayList());
			
			for(int i=0; i<m; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				
				adlist.get(v1).add(v2);
				adlist.get(v2).add(v1);
			}
			
			color = new int[n+1];
			boolean ok = true;
			for(int i=1; i<=n; i++) {
				if(color[i]==0) {
					dfs(i, 1);
				}
			}
			
			for(int i=1; i<=n; i++) {
				for(int j=0; j<adlist.get(i).size(); j++) {
					int tmp = adlist.get(i).get(j);
					if(color[i]==color[tmp])
						ok = false;
				}
			}
			
			if(ok)
				System.out.println("YES");
			else{
				System.out.println("NO");
			}
		}
	}
	
	static void dfs(int now, int c) {
		color[now] = c;
		
		for(int i=0; i<adlist.get(now).size(); i++) {
			int next = adlist.get(now).get(i);
			if(color[next]==0) {
				dfs(next, 3-c);
			}
		}
	}
}
