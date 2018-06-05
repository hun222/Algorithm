package solve;

public class Matrix {
	static final int M = 2;
	static final int N = 3;
	static int[][] aa= new int[M][N];
	static int[][] bb = new int[N][M];
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6}; //MXN
		int[] b = {2,3,4,5,6,7}; //NXM
		int[][] c = new int[N][M];
		int[][] d = new int[M][M];
		
		for(int i=0; i<M*N; i++) {
			int row = i/N;
			int col = i%N;
			int row2 = i/M;
			int col2 = i%M;
			
			aa[row][col] = a[i];
			bb[row2][col2] = b[i];
		}
		
		sum(a, b, c);
		multi(a, b, d);
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void sum(int[] a, int[] b, int[][] c) {
		for(int i=0; i<M*N; i++) {
			int row = i/N;
			int col = i%N;
		
			c[col][row] = aa[row][col] + bb[col][row];
		}
	}
	
	static void multi(int[] a, int[] b, int[][] d) {
		int idx = 0;
		int tmp = 0;
		int u = 0;
		for(int z=0; z<aa.length; z++) {
			for(int k=0; k<bb[0].length; k++) {
				for(int i = u; i<aa[0].length; i++) {
					int row = i/N;
					int col = i%N;
					
					d[z][k] += aa[z][i] * bb[i][k]; 
				}
			}
		}
	}
}
