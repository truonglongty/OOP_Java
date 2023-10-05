package tuan1.hinhchunhat;

import java.util.Scanner;

public class TestHinhChuNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HinhChuNhat h1 = new HinhChuNhat(10,7);
		System.out.println(h1);
		
		HinhChuNhat h2 = new HinhChuNhat();
		h2.setChieuDai(5);
		h2.setChieuRong(10);
		System.out.println(h2);
		
		HinhChuNhat h3 = new HinhChuNhat();
		System.out.println("Nhap chieu dai: ");
		double d = sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double r = sc.nextDouble();
		h3.setChieuDai(d);
		h3.setChieuRong(r);
		System.out.println(h3);
	}
}

