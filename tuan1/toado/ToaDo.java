package tuan1.toado;

public class ToaDo {
	private double x, y;
	private String name;
	
	public ToaDo() {};
	public ToaDo(double x, double y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.x + ", " + this.y + ")" ;
	}
	
}
