package solve;

public class TEST {
	static int d[] = new int[1000001];
	public static void main(String[] args) {
		int A[] = {-1,-3,1000000};
		System.out.println(solution(A));
	}
	static int solution(int[] A) {
		for(int i=0; i<A.length; i++) {
			if(A[i]>0)
				d[A[i]] = 1;
		}
		
		int rst = 0;
		for(int i=1; i<=d.length; i++) {
			if(d[i] == 0) {
				rst = i;
				break;
			}
		}
			
		return rst;
	}
}
