package baek.basic.graph;

import java.util.Scanner;

public class ÅÒÇÁ·ÎÁ§Æ® {
	static int[] a;
	static int[] d;
	static int[] s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-- >0) {
			int n = sc.nextInt();
			a = new int[n+1];
			d = new int[n+1];
			s = new int[n+1];
			
			for(int i=1; i<=n; i++) {
				a[i] = sc.nextInt();
			}

			int rst = 0;
			for(int i=1; i<=n; i++) {
				if(d[i]==0) {
					int now = i;
					rst += dfs(now, now,1);
				}
				
			}
					
			
			System.out.println(n-rst);
		}
	}
	
	static int dfs(int now, int i, int len) {
		if(d[now]!=0) {
			if(i !=s[now])
				return 0;
			
			return len-d[now];
		}
		d[now] = len;
		s[now] = i;
		
		int next = a[now];
		return dfs(next,i, len+1);
	}
}
