package tuan1.hinhtron;

public class ToaDo {
	private String ten;
	private float x, y;
	
	public ToaDo() {}
	public ToaDo(String ten, float x, float y) throws Exception {
		setTen(ten);
		this.x = x;
		this.y = y;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if(!ten.trim().equals(""))
			this.ten = ten;
		else
			throw new Exception("Error!");
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return ten+"("+x+";"+y+")";
	}
}
