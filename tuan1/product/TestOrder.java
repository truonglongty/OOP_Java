package tuan1.product;

import java.time.LocalDate;

public class TestOrder {
	public static void main(String[] args) {
		Product p1 = new Product("Gạo","sp1",18000);
		Product p2 = new Product("Mì","sp2",5000);
		Product p3 = new Product("Đường","sp3",22000);
		Product p4 = new Product("Nước","sp4",10000);
		
		Order order = new Order(1,LocalDate.of(2023,9,25));
		order.addLineItem(p1, 10);
		order.addLineItem(p2, 20);
		order.addLineItem(p3, 5);
		order.addLineItem(p4, 5);
		System.out.println(order);
	}
}
