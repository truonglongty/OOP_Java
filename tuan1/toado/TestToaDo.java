package tuan1.toado;

import java.util.Scanner;

public class TestToaDo {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(2,3,"A");
		System.out.println(td1);
		
		Scanner sc = new Scanner(System.in);
		ToaDo td2 = new ToaDo();
		System.out.println("Nhap ten toa do: ");
		String name = sc.nextLine();
		System.out.println("Nhap hoanh do: ");
		double x = sc.nextDouble();
		System.out.println("Nhap tung do: ");
		double y = sc.nextDouble();
		td2.setName(name);
		td2.setX(x);
		td2.setY(y);
		System.out.println(td2);
	}
}
