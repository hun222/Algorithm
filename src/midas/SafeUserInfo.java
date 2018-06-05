package midas;

import java.util.Scanner;

public class SafeUserInfo {
	public static void main(String[] args) {
		String id = "";
		String pw = "";
		Scanner sc = new Scanner(System.in);
		boolean chk = false;
		
		id = sc.nextLine();
		pw = sc.nextLine();
		
		chk = chkId(id);
		chk = chkPw(pw);
		
		if(chk == true)
			System.out.println("T");
		else
			System.out.println("F");
	}
	static boolean chkPw(String pw) {
		char[] pws = pw.toCharArray();
		boolean flag = false;
		int cntNum = 0;
		int cntAlpha = 0;
		
		if(pws.length>=8 && pws.length <= 16)
			flag = true;
		else
			return false;
		
		for(int i=0; i<pws.length; i++) {
			if((pws[i]>=97 && pws[i]<=122)|| (pws[i]>=48 && pws[i] <= 57)) {
				if(pws[i]>=97 && pws[i]<=122)
					cntAlpha++;
				if(pws[i]>=48 && pws[i] <= 57)
					cntNum++;
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(cntAlpha == 0 || cntNum == 0)
			flag = false;
		else
			flag = true;
		
		return flag;
	}
	
	static boolean chkId(String id) {
		char[] ids = id.toCharArray();
		boolean flag = false;
		int cntNum = 0;
		int cntAlpha = 0;
		
		if(ids.length>=6 && ids.length <= 12)
			flag = true;
		else
			return false;
		
		for(int i=0; i<ids.length; i++) {
			if((ids[i]>=97 && ids[i]<=122)|| (ids[i]>=48 && ids[i] <= 57)) {
				if(ids[i]>=97 && ids[i]<=122)
					cntAlpha++;
				if(ids[i]>=48 && ids[i] <= 57)
					cntNum++;
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(cntAlpha == 0 || cntNum == 0)
			flag = false;
		else
			flag = true;
		
		return flag;
	}
}
