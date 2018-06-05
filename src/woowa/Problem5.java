package woowa;

public class Problem5 {
	public static void main(String[] args) {
		int A[] = {10,19,15};
		int K = 1;
		int L = 2;
		
		System.out.println(solution(A, K, L));
	}
	
	static int solution(int[] A, int K, int L) {
		int N = A.length;
		if(N < K+L) 
			return -1;		
		
		int rst = 0;
		int tmp = 0;
		for(int i=0; i<N-K+1; i++) {
			int aliceSum = 0;
			//k번연속
			for(int j=i; j<K+i; j++) {
				aliceSum += A[j];
			}
			
			int bobSum = 0;
			
			//bob 나무 카운트
			//alice가 K개 고른 후 나머지 L개 연속된 나무를 고른다.
			for(int z=0; z<N-L+1; z++) {
				int bobTmp = 0;
				
				//i~i+K-1 까지는 사용불가(alice가 이미 사용했다.)
				if(z>=i && z<=i+K-1) {
					continue;
				}
				if(z+L> i && z<=i)
					continue;
				
				for(int y=z; y<L+z; y++) {
					bobTmp += A[y];
				}
				if(bobTmp>bobSum)
					bobSum = bobTmp;
			}
			
			tmp = aliceSum + bobSum;
			if(tmp>rst)
				rst=tmp;
			//System.out.println(aliceSum+"/"+bobSum);
		}
		return rst;
	}
}
