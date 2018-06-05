package baek.basic.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 단지번호붙이기 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] map;
	static boolean[][] chk;
	static int len;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		chk = new boolean[n+1][n+1];
		for(int i=1; i<=n; i++) {
			String line = br.readLine();
			String[] nums = line.split("");
			for(int j=0; j<nums.length; j++)
				map[i][j+1] = Integer.parseInt(nums[j]);
		}
		
		List<Integer> rstlist = new ArrayList();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j]==1 && chk[i][j]==false) {
					len = 1;
					dfs(i,j);
					rstlist.add(len);
				}
			}
		}
		
		Collections.sort(rstlist);
		System.out.println(rstlist.size());
		for(int object : rstlist) {
			System.out.println(object);
		}
	}
	
	static void dfs(int row, int col) {
		chk[row][col] = true;
		
		for(int i=0; i<4; i++) {
			if(row+dy[i]<1 || row+dy[i]>map.length-1 || col+dx[i]<1 || col+dx[i]>map[0].length-1)
				continue;
			if(map[row+dy[i]][col+dx[i]] == 1 && chk[row+dy[i]][col+dx[i]] == false) {
				len++;
				dfs(row+dy[i],col+dx[i]);
			}
		}
		
	}
}
