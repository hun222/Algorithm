package woowa;

import java.util.Stack;

public class Promblem1 {
	public static void main(String[] args) {
		String S = "13 DUP 4 POP 5 DUP + DUP + -";
		//String S = "5 6 + -";
		//String S = "3 DUP 5 - -";
		int rst = solution(S);
		
		System.out.println(rst);
	}
	
	static int solution(String S) {
		Stack<String> st = new Stack();
		String[] split = S.split(" ");
		
		for(int i=0; i<split.length; i++) {
			String op = split[i]; //operation
			
			switch(op) {
			case "POP":
				st.pop();
				break;
			case "DUP":
				String dup = st.lastElement();
				st.push(dup);
				break;
			case "+":
				if(st.size()<2)
					return -1;
				else {
					int n1 = Integer.parseInt(st.pop());
					int n2 = Integer.parseInt(st.pop());
					int sum = n1+n2;
					st.push(String.valueOf(sum));
				}
				break;
			case "-":
				if(st.size()<2)
					return -1;
				else {
					int n1 = Integer.parseInt(st.pop());
					int n2 = Integer.parseInt(st.pop());
					int sum = n1-n2;
					st.push(String.valueOf(sum));
				}
				break;
			default:
				st.push(op);
				break;
			
			}
		}
		
		int top = Integer.parseInt(st.pop());
		return top;
	}
}
