package woowa.test;

import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack();
		String[] arr = {"a", "b", "c", "d", "e", "f"};
		
		int n = sc.nextInt();
		String s = "";
		
		if(n<16) {
			if(n<10)
				s = String.valueOf(n);
			else {
				int cha = n - 10;
				s = arr[cha];
			}
		}
		else {
			int mok=n;
			int na=0;
			
			while(mok>=16) {
				na = mok%16;
				mok = mok/16;
				
				st.push(na);
			}
			st.push(mok);
		}
		
		int size = st.size();
		for(int i=0; i<size; i++) {
			int pop = st.pop();
			String tmp = String.valueOf(pop);
			if(pop >=10) {
				int cha = pop - 10;
				tmp = arr[cha];
			}
			s += tmp;
		}
		
		System.out.println(s);
	}
}
