package woowa;

import java.util.Stack;

public class Problem2 {
	public static void main(String[] args) {
		String A = "23A84Q";
		String B = "K2Q25J";
		
		int rst = solution(A, B);
		System.out.println(rst);
		
	}
	
	static int solution(String A, String B) {
		Stack<String> deckA = new Stack(); //Alec
		Stack<String> deckB = new Stack(); //Bob
		String[] hierarchy = {"A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		String[] splitA = A.split("");
		String[] splitB = B.split("");
		int N = A.length();
		
		//set deck
		for(int i=N-1; i>=0; i--) {
			deckA.push(splitA[i]);
			deckB.push(splitB[i]);
		}
		
		int rst = 0;
		
		//draw deck
		for(int i=0; i<N; i++) {
			String Alec = deckA.pop();
			String Bob = deckB.pop();
			
			int AlecNum = 0;
			int BobNum = 0;
			
			//who win
			for(int j=0; j<hierarchy.length; j++) {
				if(Alec.equals(hierarchy[j]))
					AlecNum=j;
				if(Bob.equals(hierarchy[j]))
					BobNum=j;
			}
			
			if(AlecNum>BobNum) {
				//Bob win
			}else if(AlecNum<BobNum) {
				//Alec win
				rst += 1;
			}else {
				//draw
			}
		}
		
		return rst;
	}
}
