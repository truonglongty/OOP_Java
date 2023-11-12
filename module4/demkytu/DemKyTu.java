package module4.demkytu;

import java.util.HashMap;
import java.util.HashSet;

public class DemKyTu {
	private HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	private int method (String str) {
		if(hm.containsKey(str)) {
			System.out.println("\nExisted: "+str);
			return hm.get(str);
		}
		else {
			char c[] = new char[50];
			c = str.toCharArray();
			HashSet<Character> hs = new HashSet<Character>();
			for (Character x : c) {
				hs.add(x);
			}
			System.out.println("\n\t"+str+" is a new String");
			System.out.println("HashSet created: "+hs);
			Integer value = hs.size();
			hm.put(str, value);
			System.out.println("HashMap update: "+hm);
			return value;
		}
		
	}
	
	public int getStringLength(String str) {
		return method(str);
	}
}

