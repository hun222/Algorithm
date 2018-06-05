package solve;

public class Fibo {
	public static void main(String[] args) {
		int n = 6;
		
		System.out.println(getFibo(n));
	}
	
	static int getFibo(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return getFibo(n-1) + getFibo(n-2);
		}
	}
}
