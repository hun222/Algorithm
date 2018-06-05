package woowa2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
	static Stack<Integer> st;
	static Queue<Integer> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		int j = sc.nextInt();
		st = new Stack();
		q = new LinkedList();
		
		//시계방향
		if(d==1) {
			for(int i=1; i<=n; i++)
				q.offer(i);
		}else if(d==0) {
			//반시계방향
			q.offer(1);
			for(int i=n; i>1; i--)
				q.offer(i);
		}
		josephus(n, k, j);
		int size  = st.size();
		/*for(int i=0; i<size; i++)
			System.out.println(st.get(i));*/
		
		int ans = st.pop();
		System.out.println(ans);
	}
	
	static void josephus(int n, int k, int j) {
		int idx = 1;
		int jj = j;
		while(!q.isEmpty()) {
			if(idx % k == 0) {
				q.offer(q.poll());
				int out = q.poll();
				st.push(out);
				idx = 1;
				//k += jj-1;
				k = jj;
				jj+=j;
			}else {
				q.offer(q.poll());
				idx++;
			}
		}
	}
}
