package baek.basic.math;

public class LCM {
	public static void main(String[] args) {
		int a = 4;
		int b = 18;
		double lcm = (a*b)/gcd(a,b);
		
		System.out.println(lcm);
	}
	static double gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
}
