package baek.basic.math;

import java.util.Scanner;
//b������ 10������
public class ������ȯ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] line = sc.nextLine().split(" ");
		String s = line[0];
		
		int b = Integer.parseInt(line[1]); //����
		int ans = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if('0'<=c && c<='9') {
				ans = ans*b + (c -'0'); //char -> num
			}else {
				ans = ans*b + (c - 'A' +10); //10�̻��� �� ��ȯ
			}
		}
		
		System.out.println(ans);
	}
}
