package woowa;

public class Problem4 {
	public static void main(String[] args) {
		/*int A = 2;
		int B = 4;
		int C = 2;
		int D = 4;*/
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		System.out.println(Solution(A, B, C, D));
	}
	
	static int Solution(int A, int B, int C, int D) {
		int rst = 0;
		int tmp = 0;
		//AB CD
		rst = cal(A,C,B,D);
		
		//AC BD
		tmp = cal(A,B,C,D);
		rst = (rst > tmp) ? rst:tmp;
		
		//AD BC
		tmp = cal(A,B,D,C);
		rst = (rst > tmp) ? rst:tmp;
		
		return rst;
	}
	
	static int cal(int x1, int x2, int y1, int y2) {
		int subX = x1-x2;
		int subY = y1-y2;
		double val =  Math.pow(subX, 2) + Math.pow(subY, 2);
		int rt = (int)Math.round(val*0.98);
		return Integer.parseInt(String.valueOf(rt));
	}
}
