package woowa2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int x3 = s.nextInt();
		int y3 = s.nextInt();
		int x4 = s.nextInt();
		int y4 = s.nextInt();
		int x5 = s.nextInt();
		int y5 = s.nextInt();
		int x6 = s.nextInt();
		int y6 = s.nextInt();
		
		int rst = 0;
		if(y2>y6 && y2 > y4) {
			if(y6>y4) {
				rst = (x2-x1) * (y2-y6) + (x5 - x1) * (y6 - y4);
			}else if(y4>y6){
				rst = (x2-x4) * (y4-y6) + (x2-x1) * (y2-y4);
			}else if(y4==y6) {
				rst = (x2-x1) * (y2-y6);
			}
		}else if(y2 < y6 && y2 <y4) {
			if(y6<y4) {
				rst = (y3-y5) * (x5-x1) + (x2-x1) * (y5- y1);
			}else if(y6>y4) {
				rst = (x5-x1)*(y3-y1) + (x2-x4)*(y5-y1);
			}else if(y4==y6) {
				rst = (x2-x1)*(y5-y1);
			}
		}
		System.out.println(rst);
	}
}
