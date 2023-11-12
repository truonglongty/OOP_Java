package module4.giaohoihieu;

import java.util.Collections;
import java.util.TreeSet;

public class GiaoHoiHieu {
	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		TreeSet<Integer> b = new TreeSet<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
		Collections.addAll(a, 1, 2, 3);
//		b.add(1);
//		b.add(3);
//		b.add(5);
		Collections.addAll(b, 1, 3, 5);
		
		System.out.println(a);
		System.out.println(b);
		
		TreeSet<Integer> hoi = new TreeSet<Integer>(a);
		TreeSet<Integer> hieu = new TreeSet<Integer>(a);
		TreeSet<Integer> giao = new TreeSet<Integer>(a);
		hoi.addAll(b);
		hieu.removeAll(b);
		giao.retainAll(b);
		
		System.out.println("a hội b: "+hoi);
		System.out.println("a hiệu b: "+hieu);
		System.out.println("a giao b: "+giao);
	}
}
