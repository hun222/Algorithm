package baek.basic.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 트리부모찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> adlist = new ArrayList();
		Queue<Integer> q = new LinkedList();
		int n = sc.nextInt();
		boolean[] chk = new boolean[n+1];
		int[] parent = new int[n+1];
		int[] depth = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			adlist.add(new ArrayList());
		}
		
		for(int i=1; i<n; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adlist.get(v1).add(v2);
			adlist.get(v2).add(v1);
		}
		
		q.add(1);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			chk[now] = true;
			
			for(int i=0; i<adlist.get(now).size(); i++) {
				int next = adlist.get(now).get(i);
				if(chk[next] == false) {
					q.add(next);
					parent[next] = now;
					depth[next] = depth[now] + 1;
				}
			}
		}
		
		for(int i=2; i<=n; i++) {
			System.out.println(parent[i]);
		}
	}
}
