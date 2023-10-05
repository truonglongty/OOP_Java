package tuan1.sotietkiem;

import java.time.LocalDate;

public class TestKhachHang {
	public static void main(String[] args) {
		KhachHang KH = new KhachHang("KH001","Nguyen Van An",2);
		
		KH.themSoTietKiem("STK111",LocalDate.of(2020,2,26),2000000,3,0.005f);
		KH.themSoTietKiem("STK112",LocalDate.of(2020,2,26),2000000,6,0.006f);
		
		System.out.println(KH);
		
		SoTietKiem stk1 = new SoTietKiem("STK111",LocalDate.of(2020,2,26),200000,3,0.005f);
		SoTietKiem stk2 = new SoTietKiem("STK112",LocalDate.of(2020,2,26),200000,6,0.006f);
		
//		for(SoTietKiem stk : KH.getDsSoTietKiem()) {
//			if(stk != null)
//				System.out.println(stk);
//		}
		System.out.println(stk1);
		System.out.println(stk2);
	}
}
