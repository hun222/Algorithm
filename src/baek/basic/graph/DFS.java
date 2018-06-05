package baek.basic.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * test case
6
7
1 2
1 5
2 3
2 5
3 4
4 5
4 6
 * */

public class DFS {
	static boolean chk[] = new boolean[7];
	static List<List<Integer>> adlist;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//# of vertex
		int e = sc.nextInt();	//# of edge
		adlist = new ArrayList();	//필수
		
		for(int i=0; i<=n; i++)
			adlist.add(new ArrayList());  //edge를 담을 list 생성(vertex 번호를 그대로 쓰기 위해 0~n 까지 생성해준다.)
		
		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			//무방향그래프
			adlist.get(v1).add(v2); 
			adlist.get(v2).add(v1);
		}
		dfs(1);
	}
	
	static void dfs(int now) {
		chk[now] = true;
		System.out.println(now);
		
		//now노드의 인접리스트의 수만큼 돌면서 방문안했으면 재귀
		for(int i=0; i<adlist.get(now).size(); i++) {
			int next = adlist.get(now).get(i);
			if(chk[next]==false)
				dfs(next);
		}
	}
}
