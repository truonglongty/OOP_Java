package Module3.shape;

public class Test {
	public static void main(String[] args) {
		Drawing d = new Drawing();
		Shape s1 = new Circle();
		Shape s2 = new Quad();
		Shape s3 = new Rectangle();
		Shape s4 = new Triangle();
		Shape s5 = new Polygon();
		d.drawShape(s1);
		d.drawShape(s2);
		d.drawShape(s3);
		d.drawShape(s4);
		d.drawShape(s5);
	}
}
