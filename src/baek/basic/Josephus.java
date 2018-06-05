package baek.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		Queue<Integer> q = new LinkedList();
		for(int i=1; i<=n; i++)
			q.offer(i);
		
		int i=1;
		while(!q.isEmpty()) {
			if(m==1) {
				int tmp = q.poll();
				if(q.size()>0) 
					sb.append(tmp+", ");
				else
					sb.append(tmp+">");
			}else {
				if(i%m == 1) {
					
				}else if(i%m == 0) {
					int tmp = q.poll();
					q.offer(tmp);
					tmp = q.poll();
					if(q.size()==0) {
						sb.append(tmp+">");
					}else {
						sb.append(tmp+", ");
					}
				}else {
					int tmp = q.poll();
					q.offer(tmp);
				}
			}
			i++;
		}
		
		System.out.println(sb.toString());
	}
}
