package baek.basic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ÁÂÇ¥Á¤·Ä2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Point> list = new ArrayList();
		
		for(int i=0; i<n; i++) {
			Point p = new Point();
			p.x=sc.nextInt();
			p.y=sc.nextInt();
			list.add(p);
		}
		
		Collections.sort(list);
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).x+" "+list.get(i).y);
	}
}

class Point implements Comparable<Point>{
	int x;
	int y;
	
	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		if(this.y>p.y)
			return 1;
		else if(this.y<p.y)
			return -1;
		else {
			//x up
			if(this.x>p.x)
				return 1;
			else if(this.x<p.x) 
				return -1;
			else
				return 0;
		}
	}
}
