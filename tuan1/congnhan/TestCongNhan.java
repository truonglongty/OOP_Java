package tuan1.congnhan;

import java.util.Scanner;

public class TestCongNhan {
	public static void main(String[] args) {
		DanhSachCongNhan lcn = new DanhSachCongNhan(10);
		Scanner sc = new Scanner(System.in);
		lcn.add(new CongNhan("Trương","Long Tý", 8));
		System.out.println(lcn);
		System.out.println("Nhập họ: ");
		String ho = sc.nextLine();
		System.out.println("Nhập tên: ");
		String ten = sc.nextLine();
		System.out.println("Nhập số sản phẩm: ");
		int soSP = sc.nextInt();
		lcn.add(new CongNhan(ho,ten,soSP));
		System.out.println(lcn);
		System.out.println("Số lượng công nhân trong danh sách: "+lcn.getSoLuongCN());
		System.out.println("Thông tin công nhân làm trên 200 sản phẩm\n"+lcn.toString200());
		System.out.println("Sắp xếp công nhân theo số sản phẩm giảm dần");
		lcn.sortGiamSP();
		System.out.println(lcn);
	}
}
