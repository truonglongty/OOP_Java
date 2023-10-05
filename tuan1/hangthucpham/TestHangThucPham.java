package tuan1.hangthucpham;

import java.time.LocalDate;

public class TestHangThucPham {
	public static void main(String[] args) throws Exception {
		HangThucPham h1 = new HangThucPham("001","Gạo",100000,LocalDate.of(2023,9,2),LocalDate.of(2023, 11, 10));
		HangThucPham h2 = new HangThucPham("002","Mì",5000,LocalDate.of(2023,3,1),LocalDate.of(2023, 12, 1));
		HangThucPham h3 = new HangThucPham("001","Nước",10000,LocalDate.of(2020,10,1),LocalDate.of(2022, 10, 1));
	
		System.out.println(HangThucPham.tieuDe());
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

	}
}
