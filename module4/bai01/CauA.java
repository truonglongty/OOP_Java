package module4.bai01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CauA {
	public static void main(String[] args) {
		ArrayList<String> nv = new ArrayList<String>();
		Collections.addAll(nv, "Nhân viên 1", "Nhân viên 2", "Nhân viên 3","Nhân viên 4");
		System.out.println(nv);
		Random rd = new Random();
		int index = rd.nextInt(nv.size());
		System.out.println("Nhân viên được chọn để nhận quà tặng: "+nv.get(index));
	}
}
