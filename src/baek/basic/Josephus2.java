package baek.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		Queue<Integer> q = new LinkedList();
		for(int i=1; i<=n; i++)
			q.offer(i);
		
		while(!q.isEmpty()) {
			for(int i=0; i<n-1; i++) {
				for(int j=0; j<m-1; j++) {
					q.offer(q.poll());
				}
				sb.append(q.poll()+", ");
			}
			sb.append(q.poll()+">");
		}
		
		System.out.println(sb.toString());
	}
}
