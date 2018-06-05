package midas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AutoMailNaming {
	static List<String> mailList = new ArrayList();
	static List<String> idList = new ArrayList();
	static Map<String, Integer> idMap = new HashMap();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String company = sc.nextLine();
		String names = sc.nextLine();
		
		String[] name = names.split(",");
		
		for(int i=0; i<name.length; i++) {
			if(name[i].equals("")) {
				continue;
			}
			
			setId(name[i].trim());
		}
		
		//id setting
		for(int i=0; i<idList.size();i++) {
			//System.out.println(idList.get(i));
			setEmail(idList.get(i), company);
		}
		
		for(int i=0; i<mailList.size(); i++) {
			System.out.println(mailList.get(i));
		}
		
	}
	
	static void setId(String name) {
		String id = "";

		//System.out.println(rtString(name));
		
		String[] names = rtString(name).split(" ");
		if(names.length == 2) {
			String[] split = names[0].toLowerCase().split("");
			
			id = names[1].toLowerCase().replace("-", "") + split[0];
		}else if(names.length == 3) {
			String[] split = names[0].toLowerCase().split("");
			
			id = names[2].toLowerCase().replace("-", "") + split[0];
		}
		
		idList.add(id);
	}
	static String rtString(String name) {
		String rt = "";
		String tmp = "";
		name = name.replaceAll(" ", "");
		
		char[] names = name.toCharArray();
		
		for(int i=0; i<names.length; i++) {
			if(names[i] >=65 && names[i] <= 90) {
				if(i>0) {
					if(names[i-1]=='-')
						rt+=tmp;
					else
						rt+= tmp+" ";
				}
				tmp = names[i]+"";
			}else {
				tmp+=names[i];
			}
		}
		rt+=tmp;
		
		return rt;
	}
	static void setEmail(String id, String company) {
		String email = "";
		if(idMap.get(id) == null) {
			idMap.put(id, 1);
			email = id+"@"+company.toLowerCase().trim()+".com";
		}else {
			idMap.put(id, idMap.get(id)+1);
			email = id+idMap.get(id)+"@"+company.toLowerCase().trim()+".com";
		}
		
		mailList.add(email);
	}
	
	
}
