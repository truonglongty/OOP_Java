package tuan1.cd;

import java.util.Scanner;

public class TestCD {
	public static void main(String[] args) {
		CDList cdl = new CDList(10);
		Scanner sc = new Scanner(System.in);
		cdl.add(new CD(111, "abc",3,200000));
		cdl.add(new CD(112, "xyz",5,500000));
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. Thêm CD");
			System.out.println("2. Số lượng CD");
			System.out.println("3. Tổng giá thành");
			System.out.println("4. Thông tin toàn bộ CD");
			System.out.println("5. Tìm theo mã");
			System.out.println("6. Sắp xếp danh sách giảm dần theo giá thành.");
			System.out.println("7. Sắp xếp danh sách tăng dần theo tựa CD.");
			System.out.println("0. Thoát");
			System.out.println("----------------------------------------------------------");
			System.out.println("Nhập lựa chọn: ");
			int lc; lc = sc.nextInt();
			if(lc == 1) {
				System.out.println("Nhập mã CD");
				int maCD = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập tựa CD");
				String tuaCD = sc.nextLine();
				System.out.println("Nhập số bài hát");
				int soBaiHat = sc.nextInt();
				System.out.println("Nhập giá thành");
				double gia = sc.nextDouble();
				cdl.add(new CD(maCD, tuaCD, soBaiHat, gia));
			}
			else if(lc == 2) {
				System.out.println(cdl.soLuongCD());
			}
			else if(lc == 3) {
				System.out.println("Tống giá thành: "+cdl.tongGiaThanh());
			}
			else if(lc == 4) {
				System.out.println(cdl);
			}
			else if(lc == 5) {
				System.out.println("Nhập mã CD cần tìm: ");
				int x = sc.nextInt();
				System.out.println("Tìm thấy: "+cdl.timTheoMa(x));
			}
			else if(lc == 6) {
				cdl.sortGiamGiaThanh();
				System.out.println(cdl);
			}
			else if(lc == 7) {
				cdl.sortTangTuaCD();
				System.out.println(cdl);
			}
			else
				break;
		}
	}
}
