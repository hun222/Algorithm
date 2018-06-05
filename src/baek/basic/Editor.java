package baek.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//1406
//입력받을때 BufferedReader로 받아야함
public class Editor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<String> left = new Stack();
		Stack<String> right = new Stack();
		
		//String s = sc.nextLine();
		String s = br.readLine();
		//int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			//left.add(Character.toString(arr[i]));
			left.add(s.charAt(i)+"");
		}
		
		while(n-- >0) {
			String[] line = br.readLine().split(" ");
			//String op = sc.next();
			String op = line[0];
			
			switch(op) {
			case "L":
				if(left.size()>0) {
					right.add(left.pop());
				}
				break;
			case "D": 
				if(right.size()>0) {
					left.add(right.pop());
				}
				break;
			case "B":
				if(left.size()>0) {
					left.pop();
				}
				break;
			case "P":
				//String stmp = sc.nextLine();
				String stmp = line[1];
				left.add(stmp.trim());
				break;
			}
		}
		StringBuffer str = new StringBuffer();
		
		while(!left.isEmpty()) {
			right.add(left.pop());
		}
		
		while(!right.isEmpty())
			str.append(right.pop());
		
		System.out.println(str);
		
	}
}
