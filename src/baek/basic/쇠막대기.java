package baek.basic;

import java.util.Scanner;
import java.util.Stack;

//10799
public class ¼è¸·´ë±â {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack();
		
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		
		int sum = 0;
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			if(arr[i] == ')') {
				if(arr[i-1] == '(') {
					st.pop();
					sum += st.size();
				}else {
					st.pop();
					sum += 1;
				}
			}else {
				st.add(arr[i]); //'(' add
			}
		}
		
		System.out.println(sum);
	}
}
