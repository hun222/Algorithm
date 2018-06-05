package midas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterstellarTravel {
	static char alpha[] = {
		'A', 'B', 'C', 'D', 'E', 'F'
		, 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'
		, 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	static Queue<Integer> q;
	static int map[][];
	static int[] memo = new int[alpha.length];
	static boolean[] chk = new boolean[alpha.length];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		map = new int[26][26];
		sc.nextLine();
		q = new LinkedList();
		
		//map setting
		while(n-->0) {
			String input = sc.nextLine();
			String split[] = input.split(",");
			String node1 = split[0];
			String node2 = split[1];
			int n1 =0;
			int n2 =0;
			for(int i=0; i<alpha.length; i++) {
				if(node1.charAt(0) == alpha[i]) {
					n1 = i;
				}
				if(node2.charAt(0) == alpha[i]) {
					n2 = i;
				}
			}
			
			map[n1][n2] = 1;
		}
		
		String tmp = sc.nextLine();
		int visit = 0; //경유지
		for(int i=0; i<alpha.length; i++) {
			if(tmp.charAt(0) == alpha[i])
				visit = i;
		}
		//bfs
		q.add(0); //A start
		BFSvisit(0);
		int rst = 0;
		rst = memo[visit];
		
		q.add(visit);
		BFSfinal(visit);
		
		rst += memo[25];
		System.out.println(rst);
	}
	
	static void BFSvisit(int num) {
		while(!q.isEmpty()) {
			int now = q.remove();
			
			for(int i=0; i<map.length; i++) {
				if(map[now][i]==1) {
					if(chk[i]==false) {
						q.add(i);
						chk[i] = true;
						memo[i] = memo[now] + 1;
					}
				}
			}
		}
	}
	
	//D를 경유해서 Z로 가도록 다시 탐색
	static void BFSfinal(int num) {
		chk = new boolean[alpha.length];
		memo = new int[alpha.length];
		
		while(!q.isEmpty()) {
			int now = q.remove();
			
			for(int i=0; i<map.length; i++) {
				if(map[now][i]==1) {
					if(chk[i]==false) {
						q.add(i);
						chk[i]  = true;
						memo[i] = memo[now] + 1;
					}
				}
			}
		}
		
		
	}
}
