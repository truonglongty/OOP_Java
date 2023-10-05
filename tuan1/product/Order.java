package tuan1.product;

import java.time.LocalDate;
import java.util.Arrays;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count = 0;
	
//	public void addLineItem(Product p, int x) {
//		if(count < lineItems.length) {
//			lineItems[count++] = new OrderDetail(p, x);
//		}
//	}
	public void addLineItem(Product p, int x) {
	    if (count < lineItems.length) {
	        OrderDetail orderDetail = new OrderDetail(p, x);
	        orderDetail.setStt(count + 1); // Tăng STT lên 1
	        lineItems[count++] = orderDetail;
	    }
	}
	
	public double calcTotalCharge() {
		double s = 0;
		for(int i=0; i<count; i++) {
			s += lineItems[i].calcTotalPrice();
		}
		return s;
	}

//	@Override
//	public String toString() {
//		String s = "";
//		s += "Mã HD: " + orderID + "\n";
//		s += "Ngày lập hóa đơn: " + orderDate + "\n";
//		s += OrderDetail.getTieuDe() +"\n";
//		for(int i=0; i<count; i++) {
//			s +=  lineItems[i] + "\n";
//		}
//		s += "Tổng tiền thanh toán: " + calcTotalCharge();
//		return s;
//	}
	@Override
	public String toString() {
	    String s = "";
	    s += "Mã HD: " + orderID + "\n";
	    s += "Ngày lập hóa đơn: " + orderDate + "\n";
	    s += OrderDetail.getTieuDe() + "\n";
	    for (int i = 0; i < count; i++) {
	        OrderDetail orderDetail = lineItems[i];
	        s += String.format("%4d %8s %20s %15.2f %8d %15.2f\n", 
	                orderDetail.getStt(), 
	                orderDetail.getProduct().getProductID(), 
	                orderDetail.getProduct().getDescription(),
	                orderDetail.getProduct().getPrice(),
	                orderDetail.getQuatity(),
	                orderDetail.calcTotalPrice());
	    }
	    s += "Tổng tiền thanh toán: " + calcTotalCharge();
	    return s;
	}


	public Order(int orderID, LocalDate orderDate) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = new OrderDetail[20];
		this.count = 0;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

}
