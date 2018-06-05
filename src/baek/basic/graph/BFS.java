package baek.basic.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	static List<List<Integer>> adlist;
	static boolean chk[]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList();
		int n = sc.nextInt();
		int e = sc.nextInt();
		chk = new boolean[n+1];
		adlist = new ArrayList();
		
		for(int i=0; i<=n; i++)
			adlist.add(new ArrayList());
		
		//set adlist
		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adlist.get(v1).add(v2);
			adlist.get(v2).add(v1);
		}
		
		q.add(1);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			chk[now] = true;
			System.out.println(now);
			
			for(int i=0; i<adlist.get(now).size(); i++) {
				int next = adlist.get(now).get(i);
				if(chk[next] == false) {
					q.add(next);
					chk[next] = true;
				}
			}
		}
	}
}
