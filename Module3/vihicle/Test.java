package Module3.vihicle;

public class Test {
	public static void main(String[] args) {
		Vihicle bicycle = new Bicycle("Acme", 2000000);
		Vihicle motorcycle = new Motorcycle("Honda", 35000000);
		Vihicle car = new PassengerCar("Toyota", 120000000, 5);
		Vihicle truck = new Truck("Volvo", 100000000);
		
		System.out.println("--------------------VAT--------------------");
		System.out.println("Bicycle: " + bicycle.tinhVAT());
        System.out.println("Motorcycle: " + motorcycle.tinhVAT());
        System.out.println("Passenger Car: " + car.tinhVAT());
        System.out.println("Truck: " + truck.tinhVAT());
	}
}
