package woowa2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		List<Point> list = new ArrayList();
		List<Point> list2 = new ArrayList();
		for(int i=0; i<n; i++) {
			String rd = br.readLine();
			String[] rds = rd.split(" ");
			
			int x1 = Integer.parseInt(rds[0]);
			int x2 = Integer.parseInt(rds[1]);
			Point p = new Point(x1,x2);
			list.add(p);
		}
		
		list2.add(new Point(0,list.get(0).x1));
		System.out.println("(-, "+list.get(0).x1+")");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j)
					continue;
			
				if(list.get(i).x1 <= list.get(j).x1 && list.get(i).x2 <= list.get(j).x2
						&& list.get(i).x2 >= list.get(j).x1) {
					Point p = new Point(list.get(j).x1, list.get(i).x2);
					list2.add(p);
					System.out.println("["+list.get(j).x1+", "+list.get(i).x2+"]");
				}
			}
		}
		
		for(int i=0; i<n-1; i++) {
			if(list.get(i).x2 < list.get(i+1).x1) {
				Point p = new Point(list.get(i).x2, list.get(i+1).x1);
				list2.add(p);
				System.out.println("("+list.get(i).x2+", "+list.get(i+1).x1+")");
			}
		}
		
		list2.add(new Point(list.get(n-1).x2,1000000001));
		System.out.println("("+list.get(n-1).x2+", +)");
	}
}
class Point{
	int x1;
	int x2;
	
	public Point(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
}

