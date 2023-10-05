package tuan1.thongtindangkyxe;

public class TestThongTinDangKyXe {
	public static void main(String[] args) throws Exception {
		ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyễn Thu Loan","Future Neo",100,35000000);
		ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Lê Minh Tính","Ford Ranger",3000,250000000);
		ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyễn Minh Triết","Landscape",1500,1000000000);
		System.out.println(ThongTinDangKyXe.tieuDe());
		System.out.println("=======================================================================================================================");
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}
}
