package baek.basic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 나이순정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<guest> list = new ArrayList();
		
		for(int i=0; i<n; i++) {
			guest g = new guest();
			g.age = sc.nextInt();
			g.name = sc.nextLine().trim();
			g.seq = i;
			list.add(g);
		}
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).age+" "+list.get(i).name);
		}
	}
}

class guest implements Comparable<guest>{
	int age;
	String name;
	int seq;
	
	@Override
	public int compareTo(guest g) {
		// TODO Auto-generated method stub
		if(this.age<g.age)
			return -1;
		else if(this.age>g.age)
			return 1;
		else {
			if(this.seq<g.seq)
				return -1;
			else if(this.seq>g.seq)
				return 1;
			else
				return 0;
		}
	}
}