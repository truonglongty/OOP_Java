package tuan1.product;

public class OrderDetail {
	private int quatity;
	private Product product;
	private int stt;
	
	public OrderDetail(Product product, int quatity) {
		this.quatity = quatity;
		this.product = product;
	}

//	public int getQuatity() {
//		return quatity;
//	}
//	public void setQuatity(int quatity) {
//		this.quatity = quatity;
//	}
//
//	public double calcTotalPrice() {
//		return quatity * product.getPrice();
//	}
//	
//   public int getStt() {
//        return stt;
//    }
//
//    public void setStt(int stt) {
//        this.stt = stt;
//    }

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}
	public double calcTotalPrice() {
		return quatity * product.getPrice();
	}
	
	@Override
	public String toString() {
		return product+"	"+getQuatity()+ "	 "+calcTotalPrice();
	}
	
	
	public static String getTieuDe() {
		 return String.format("%4s %8s %20s %15s %8s %15s","STT","Mã_Sp","Mô_tả","Đơn_giá","SLuong","Thành_tiền");
	}
	
	
}
